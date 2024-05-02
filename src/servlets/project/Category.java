package servlets.project;

import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/project/category")
public class Category extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int category_id = Integer.parseInt(request.getParameter("id"));

        request.setAttribute("someNews", DBConnector.getNewsByCategory(category_id));

        request.getRequestDispatcher("/html/project/main.jsp").forward(request, response);
    }
}
