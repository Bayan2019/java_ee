package ch03.bitlabAcademy;

import db.DBConnector;
import db.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@WebServlet(value = "/bitlab_academy")
public class Task_03_Main extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("students", DBConnector.getAllStudents());
        request.setAttribute("cities", DBConnector.getAllCities());
        request.getRequestDispatcher("/html/bitlabAcademyMain.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("studentName");
        String surname = request.getParameter("studentSurname");
        LocalDate birthdate = LocalDate.parse(request.getParameter("studentBirthdate"));
        Long city_id = Long.parseLong(request.getParameter("studentCity"));

        DBConnector.addStudent(new Student(name, surname, birthdate, city_id));
        request.setAttribute("students", DBConnector.getAllStudents());
        request.getRequestDispatcher("/html/bitlabAcademyMain.jsp").forward(request, response);
    }
}
