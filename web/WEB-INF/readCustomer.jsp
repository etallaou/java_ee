<%--
  Created by IntelliJ IDEA.
  User: TAD4ABT
  Date: 11.07.2018
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>Customer</title>
    <link type="text/css" rel="stylesheet" href="../inc/style.css" />
</head>
<body>
    <c:import url="../inc/menu.jsp" />
    <div id="corps">
        <p class="info">${message}</p>
        <c:if test="${ !error }">
            <p>Detail Client</p>
            <p>Last Name: <c:out value="${customer.nom}" /></p>
            <p>First Name: <c:out value="${customer.prenom}" /></p>
            <p>Address <c:out value="${customer.adresse}" /></p>
            <p>Phone: <c:out value="${customer.telephone}" /></p>
            <p>Email: <c:out value="${customer.email}" /></p>

        </c:if>
    </div>

</body>
</html>
