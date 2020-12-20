package com.example.WebAppTutorial;

import Errorhandler.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("username",request.getParameter("loginName"));
        request.setAttribute("Password",request.getParameter("Password"));
        User user =  new User();

        if(user.isUserValid(request.getParameter("loginName"),request.getParameter("Password"))){
            request.getRequestDispatcher("/Welcome.jsp").forward(request,response);
        }
        else{
            request.setAttribute("errorMessage","Invalid username or Password please try again!");
            request.getRequestDispatcher("/Login.jsp").forward(request,response);
        }

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("loginName: " + request.getParameter("loginName") + " ,Password: " + request.getParameter("Password"));
    }
}
