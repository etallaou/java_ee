package com.etallaou.servlets;

import com.etallaou.beans.Customer;
import com.etallaou.beans.Order;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "ReadOrder")
public class ReadOrder extends HttpServlet {
    private static final String U_LNAME = "nomClient";
    private static final String U_FNAME = "prenomClient";
    private static final String U_ADDRESS = "adresseClient";
    private static final String U_PHONE = "telephoneClient";
    private static final String U_EMAIL = "emailClient";

    private static final String U_DATE = "dateCommande";
    private static final String U_PRICE = "montantCommande";
    private static final String U_PAYMENT_MODE = "modePaiementCommande";
    private static final String U_PAYMENT_STATUS = "statutPaiementCommande";
    private static final String U_DELIVERY_MODE = "modeLivraisonCommande";
    private static final String U_DELIVERY_STATUS = "statutLivraisonCommande";


    private static final String U_Order = "order";
    private static final String U_MESSAGE = "message";
    private static final String U_ERROR = "error";

    private static final String FORMAT_DATE = "dd/MM/yyyy HH:mm:ss";

    private static final String VIEW = "/WEB-INF/readOrder.jsp";
    private static final String createOrderRoute = "/createOrder";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String lName = ((request.getParameter(U_LNAME) != null) ? request.getParameter(U_LNAME) : "");
        String fName = ((request.getParameter(U_FNAME) != null) ? request.getParameter(U_FNAME) : "");
        String address = ((request.getParameter(U_ADDRESS) != null) ? request.getParameter(U_ADDRESS) : "");
        String phone = ((request.getParameter(U_PHONE) != null) ? request.getParameter(U_PHONE) : "");
        String email = ((request.getParameter(U_EMAIL) != null) ? request.getParameter(U_EMAIL) : "");

        DateTime dt = new DateTime();

        DateTimeFormatter formatter = DateTimeFormat.forPattern(FORMAT_DATE);
        String date = dt.toString(formatter);

        double price;

        try{

            price = Double.parseDouble(((request.getParameter(U_PRICE) != null) ? request.getParameter(U_PRICE) : ""));
        } catch (NumberFormatException e){
            price = -1.0;
        }

        String modePaiement = request.getParameter( U_PAYMENT_MODE );
        String statutPaiement = request.getParameter( U_PAYMENT_STATUS );
        String modeLivraison = request.getParameter( U_DELIVERY_MODE );
        String statutLivraison = request.getParameter( U_DELIVERY_STATUS );

        String message;
        boolean error;
        if(lName.trim().isEmpty() || address.trim().isEmpty() || phone.trim().isEmpty() || price == -1) {
            message = "Error, Please fill all required (*) field. <br> <a href="+ createOrderRoute+">" +
                    "Here </a> To refill your form";
            error = true;
        } else {
            message = "Order successfully added!!";
            error = false;
        }

        Customer customer = new Customer(lName, fName, address, phone, email);
        Order order = new Order(customer, date, price, modePaiement, statutPaiement,
                modeLivraison,  statutLivraison);
        request.setAttribute(U_Order, order);
        request.setAttribute(U_MESSAGE, message);
        request.setAttribute(U_ERROR, error);


        this.getServletContext().getRequestDispatcher(VIEW).forward(request, response);

    }
}
