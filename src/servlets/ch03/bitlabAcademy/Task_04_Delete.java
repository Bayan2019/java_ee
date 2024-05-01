package servlets.ch03.bitlabAcademy;

import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/bitlab_academy/delete")
public class Task_04_Delete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        System.out.println(id);

        DBConnector.deleteStudent(id);

        request.setAttribute("students", DBConnector.getAllStudents());
        request.setAttribute("cities", DBConnector.getAllCities());

        request.getRequestDispatcher("/html/bitlabAcademy/bitlabAcademyMain.jsp").forward(request, response);
    }
}
