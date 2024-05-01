package servlets.ch03.bitlabAcademy;

import db.City;
import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/bitlab_academy/cities")
public class Task_05_Main extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("cities", DBConnector.getAllCities());
        request.getRequestDispatcher("/html/ch03/bitlabAcademy/bitlabAcademyMain2.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("cityName");
        String code = request.getParameter("cityCode");

        DBConnector.addCity(new City(name, code));
        request.setAttribute("cities", DBConnector.getAllCities());
        request.getRequestDispatcher("/html/ch03/bitlabAcademy/bitlabAcademyMain2.jsp").forward(request, response);
    }
}
