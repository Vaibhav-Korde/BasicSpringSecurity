package com.bas.controller;

import com.bas.dto.LoanInfo;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Controller
public class LoanInfoController {

    @GetMapping("/loan-info.htm")
    public String loanInformation(Model model){
        LoanInfo loanInfo = LoanInfo.of().loanNo(UUID.randomUUID().toString().substring(0,10))
                .loanType("House Loan").loanHolderName("Joasph")
                .tenure(323).emiAmount(2000).build();
        model.addAttribute("loanInfo",loanInfo);

        SecurityContext securityContext = SecurityContextHolder.getContext();
        if(securityContext != null) {
            Authentication authentication = securityContext.getAuthentication();

            if (authentication instanceof UsernamePasswordAuthenticationToken) {
                UserDetails userDetails = (UserDetails) ((UsernamePasswordAuthenticationToken) authentication)
                        .getPrincipal();
                System.out.println(userDetails.getUsername());

            }
        }

        return "loan-info";
    }
}
