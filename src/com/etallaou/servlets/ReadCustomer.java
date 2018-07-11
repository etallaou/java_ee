package com.etallaou.servlets;

import com.etallaou.beans.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ReadCustomer")
public class ReadCustomer extends HttpServlet {
    private static final String U_LNAME = "nomClient";
    private static final String U_FNAME = "prenomClient";
    private static final String U_ADDRESS = "adresseClient";
    private static final String U_PHONE = "telephoneClient";
    private static final String U_EMAIL = "emailClient";

    private static final String U_CLIENT = "customer";
    private static final String U_MESSAGE = "message";
    private static final String U_ERROR = "error";

    private static final String VIEW = "/WEB-INF/readCustomer.jsp";
    private static final String createCustomerRoute = "/createCustomer";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lName = ((request.getParameter(U_LNAME) != null) ? request.getParameter(U_LNAME) : "");
        String fName = ((request.getParameter(U_FNAME) != null) ? request.getParameter(U_FNAME) : "");
        String address = ((request.getParameter(U_ADDRESS) != null) ? request.getParameter(U_ADDRESS) : "");
        String phone = ((request.getParameter(U_PHONE) != null) ? request.getParameter(U_PHONE) : "");
        String email = ((request.getParameter(U_EMAIL) != null) ? request.getParameter(U_EMAIL) : "");

        String message;
        boolean error;

        if(lName.trim().isEmpty() || address.trim().isEmpty() || phone.trim().isEmpty()) {
            message = "Error, Please fill all required (*) field. <br> <a href=" + createCustomerRoute + " >Here " +
                    "</a> To refill your form";
            error = true;
        } else {
            message = "Customer successfully added!!";
            error = false;
        }

        Customer customer = new Customer(lName, fName, address, phone, email);
        request.setAttribute(U_CLIENT, customer);
        request.setAttribute(U_MESSAGE, message);
        request.setAttribute(U_ERROR, error);


        this.getServletContext().getRequestDispatcher(VIEW).forward(request, response);

    }
}
