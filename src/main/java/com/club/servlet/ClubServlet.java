package com.club.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/club"})
public class ClubServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!doctype html>");
            out.println("<html><head><meta charset='utf-8'><title>Clubs</title></head><body>");
            out.println("<h1>Our Clubs</h1>");
            out.println("<ul>");
            out.println("<li>Yoga Club - Mon/Wed/Fri</li>");
            out.println("<li>Weightlifting - Tue/Thu</li>");
            out.println("<li>Cardio Club - Weekends</li>");
            out.println("</ul>");
            out.println("<p><a href=\"/home\">Back to Home</a></p>");
            out.println("</body></html>");
        }
    }
}
