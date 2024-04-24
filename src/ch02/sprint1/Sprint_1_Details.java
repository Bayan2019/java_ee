package ch02.sprint1;

import db.DBManager;
import db.Task;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.LoggingPermission;

@WebServlet(value = "/sprint_1/details")
public class Sprint_1_Details extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("task", DBManager.getTask(id));
        request.getRequestDispatcher("/html/sprint1Details.jsp").forward(request, response);
    }
}
