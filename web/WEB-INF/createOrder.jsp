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
    <title>Add new Order</title>
    <link type="text/css" rel="stylesheet" href="../inc/style.css" />
</head>
<body>
<div>
    <c:import url="../inc/menu.jsp" />
    <form method="get" action="/readOrder">
        <fieldset>
            <legend>Customer details</legend>
            <c:import url="../inc/inc_client_form.jsp"/>
        </fieldset>
        <fieldset>
            <legend>Order Details</legend>

            <label for="dateCommande">Date <span class="requis">*</span></label>
            <input type="text" id="dateCommande" name="dateCommande" value="" size="20" maxlength="20" disabled />
            <br />

            <label for="montantCommande">Price <span class="requis">*</span></label>
            <input type="text" id="montantCommande" name="montantCommande" value="" size="20" maxlength="20" />
            <br />

            <label for="modePaiementCommande">Payment mode<span class="requis">*</span></label>
            <input type="text" id="modePaiementCommande" name="modePaiementCommande" value="" size="20" maxlength="20" />
            <br />

            <label for="statutPaiementCommande">Payment status</label>
            <input type="text" id="statutPaiementCommande" name="statutPaiementCommande" value="" size="20" maxlength="20" />
            <br />

            <label for="modeLivraisonCommande">Delivery Mode<span class="requis">*</span></label>
            <input type="text" id="modeLivraisonCommande" name="modeLivraisonCommande" value="" size="20" maxlength="20" />
            <br />

            <label for="statutLivraisonCommande">Delivery Status</label>
            <input type="text" id="statutLivraisonCommande" name="statutLivraisonCommande" value="" size="20" maxlength="20" />
            <br />
        </fieldset>
        <input type="submit" value="Submit"  />
        <input type="reset" value="Reset" /> <br />
    </form>
</div>
</body>
</html>