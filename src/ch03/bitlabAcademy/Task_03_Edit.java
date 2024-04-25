package ch03.bitlabAcademy;

import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/bitlab_academy/edit")
public class Task_03_Edit extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("student", DBConnector.getStudent(id));
        request.getRequestDispatcher("/html/bitlabAcademyEdit.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));

        String name = request.getParameter("studentName");
        String surname = request.getParameter("studentSurname");
        String birthdate = request.getParameter("studentBirthdate");
        String city = request.getParameter("studentCity");

        DBConnector.updateStudent(id, name, surname, birthdate, city);

        request.setAttribute("students", DBConnector.getAllStudents());
        request.getRequestDispatcher("/html/bitlabAcademyMain.jsp").forward(request, response);
    }
}
