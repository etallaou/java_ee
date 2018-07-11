<%--
  Created by IntelliJ IDEA.
  User: TAD4ABT
  Date: 11.07.2018
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Customer detail</title>
    <link type="text/css" rel="stylesheet" href="../inc/style.css" />
</head>
<body>
<div>
    <c:import url="../inc/menu.jsp" />
    <form method="get" action="/readCustomer">
        <fieldset>
            <legend>Customer details</legend>
            <c:import url="../inc/inc_client_form.jsp"/>
        </fieldset>
        <input type="submit" value="Submit"  />
        <input type="reset" value="Reset" /> <br />
    </form>
</div>
</body>
</html>
