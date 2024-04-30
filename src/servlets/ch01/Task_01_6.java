package servlets.ch01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/task_1_6")
public class Task_01_6 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("fullName");
        int points = Integer.parseInt(request.getParameter("points"));

        String assessment="";

        if (points>=90) {
            assessment="A";
        } else if ((points>=75) && (points<=89)) {
            assessment="B";
        } else if (points<=74 && points>=60) {
            assessment="C";
        } else if (points<=59 && points>=50) {
            assessment="D";
        } else if (points<=49) {
            assessment="F";
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        out.print("<h1>" + name + " got " + "\""+ assessment + "\"" + " for Exam!</h1>");
    }
}
