<%--
  Created by IntelliJ IDEA.
  User: TAD4ABT
  Date: 11.07.2018
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Order</title>
    <link type="text/css" rel="stylesheet" href="../inc/style.css" />
</head>
<body>
    <c:import url="../inc/menu.jsp" />
    <div id="corps">
        <p class="info">${message}</p>
        <c:if test="${ !error }">
            <p>Detail Client</p>
            <p>Last Name: <c:out value="${order.client.prenom}" /></p>
            <p>First Name: <c:out value="${order.client.nom}" /></p>
            <p>Address: <c:out value="${order.client.nom}" /></p>
            <p>Phone: </p>
            <p>Email: </p>

            <p>Detail Order</p>
            <p>Date: </p>
            <p>Price: </p>
            <p>Payment mode:  </p>
            <p>Payment status: </p>
            <p>Delivery Mode: </p>
            <p>Delivery status: </p>
        </c:if>
    </div>

</body>
</html>
