package servlets.ch03.bitlabAcademy;

import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/bitlab_academy/edit")
public class Task_04_Edit extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("student", DBConnector.getStudent(id));
        request.setAttribute("cities", DBConnector.getAllCities());

        request.getRequestDispatcher("/html/ch03/bitlabAcademy/bitlabAcademyEdit.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));

        String name = request.getParameter("studentName");
        String surname = request.getParameter("studentSurname");
        String birthdate = request.getParameter("studentBirthdate");
        Long city_id = Long.parseLong(request.getParameter("studentCity"));

        DBConnector.updateStudent(id, name, surname, birthdate, city_id);

        response.sendRedirect("/bitlab_academy");
    }
}
