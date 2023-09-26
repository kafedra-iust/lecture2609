package com.example.lecture2609;

import java.io.*;

import com.example.lecture2609.beans.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("user");
        int age = Integer.parseInt(request.getParameter("age"));

        request.setAttribute("student", new Student(name, age));

        request.getRequestDispatcher("/hello.jsp").forward(request, response);
    }
}