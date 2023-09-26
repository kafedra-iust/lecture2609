package com.example.lecture2609;

import com.example.lecture2609.beans.Calculator;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "TabServlet", value = "/tabulation")
public class TabServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double start = Double.parseDouble(request.getParameter("start"));
        double end = Double.parseDouble(request.getParameter("end"));
        double step = Double.parseDouble(request.getParameter("step"));

        Calculator calculator = new Calculator(start, end, step);
        request.setAttribute("calc", calculator);

        request.getRequestDispatcher("/tab.jsp").forward(request, response);
    }
}
