package com.reimburse;
import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //checks if the username and password is valid or not
        if(username.equals("admin") && password.equals("pass"))
        {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcomeservlet");
            requestDispatcher.forward(request,response);
        }
        else{
            out.println("invald try again");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.html");
            requestDispatcher.include(request,response);
        }
    }
}
