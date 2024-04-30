package servlets.ch01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/task_1_5")
public class Task_01_5 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("fullName");
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");

        String d = age<=18 ? "Dude" : "Dear";
        String m = (gender.equals("male")) ? "Mister" : "Miss";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        out.print("<h1>Hello " + d + " " + m
                + " " + name + "</h1>");
    }
}
