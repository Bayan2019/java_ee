package ch03.bitlabAcademy;

import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/bitlab_academy/cities/edit")
public class Task_05_Edit extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("city", DBConnector.getCity(id));
        request.getRequestDispatcher("/html/bitlabAcademyEdit2.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));

        String name = request.getParameter("cityName");
        String code = request.getParameter("cityCode");

        DBConnector.updateCity(id, name, code);

        request.setAttribute("cities", DBConnector.getAllCities());
        request.getRequestDispatcher("/html/bitlabAcademyMain2.jsp").forward(request, response);
    }
}
