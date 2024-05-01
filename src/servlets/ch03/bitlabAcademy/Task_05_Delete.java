package servlets.ch03.bitlabAcademy;

import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/bitlab_academy/cities/delete")
public class Task_05_Delete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));

        DBConnector.deleteCity(id);

        request.setAttribute("cities", DBConnector.getAllCities());
        request.getRequestDispatcher("/html/bitlabAcademy/bitlabAcademyMain2.jsp").forward(request, response);
    }
}
