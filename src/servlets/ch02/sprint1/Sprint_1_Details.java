package servlets.ch02.sprint1;

import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/sprint_1/details")
public class Sprint_1_Details extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("task", DBManager.getTask(id));
        request.getRequestDispatcher("/html/ch02/sprint1/sprint1Details.jsp").forward(request, response);
    }
}
