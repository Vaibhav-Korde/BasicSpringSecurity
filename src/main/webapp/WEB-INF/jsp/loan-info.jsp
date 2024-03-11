<%--
  Created by IntelliJ IDEA.
  User: vaibh
  Date: 08-03-2024
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<html lang="en" xmlns:th="https://www.thymeleaf.com">
<head>
    <title>Loan Information</title>
</head>
<body>
    <h2>Loan Information</h2>
    <p>Loan# : ${loanInfo.loanNo}</p>
    <p>Loan Type : ${loanInfo.loanType}</p>
    <p>Loan Holder Name : ${loanInfo.loanHolderName}</p>
    <p>Tenure : ${loanInfo.tenure}</p>
    <p>Emi Amount : ${loanInfo.emiAmount}</p>
</body>
</html>
