package ch03.bitlabAcademy;

import db.DBConnector;
import db.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(value = "/bitlab_academy/delete")
public class Task_03_Delete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        System.out.println(id);

        DBConnector.deleteStudent(id);

        request.setAttribute("students", DBConnector.getAllStudents());
        request.getRequestDispatcher("/html/bitlabAcademyMain.jsp").forward(request, response);
    }
}
