package com.club.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/", "/home"})
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!doctype html>");
            out.println("<html><head><meta charset='utf-8'><title>Fitness Club</title></head><body>");
            out.println("<h1>Welcome to the Fitness Club</h1>");
            out.println("<p>Explore our clubs and classes.</p>");
            out.println("<a href=\"/club\">View Clubs</a>");
            out.println("</body></html>");
        }
    }
}
