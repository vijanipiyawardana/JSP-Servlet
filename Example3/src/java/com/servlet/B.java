/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vijani
 */
public class B extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        out.write("<html>");
        out.write("<head>");
        out.write("</head>");
        out.write("<body>");
        if(username.equals("vijani")&&(password.equals("123"))){
            out.write("<p>Correct</p>");
        }else{
            out.write("<p>Wrong</p>");
        }
        out.write("</body>");
        out.write("</html>");
    }
}
