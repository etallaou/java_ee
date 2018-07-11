package com.etallaou.servlets;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class CreateOrder extends HttpServlet {
    private static final String VIEW = "/WEB-INF/createOrder.jsp";


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        this.getServletContext().getRequestDispatcher(VIEW).forward(request, response);
    }
}
