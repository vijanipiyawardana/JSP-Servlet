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
public class A extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("</head>");
        out.write("<body>");
        out.write("<form action = 'print' method = POST>");
        out.write("<p>Username :</p>");
        out.write("<Input type = 'text' name = 'username'>");
        out.write("<br>");
        out.write("<p>Password :</p>");
        out.write("<Input type = 'password' name = 'password'>");
        out.write("<br><br>");
        out.write("<Input type = 'submit' value = 'Login'>");
        out.write("</form>");
        out.write("</body>");
        out.write("</html>");
    }
}
