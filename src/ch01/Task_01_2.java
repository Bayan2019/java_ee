package ch01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import db.DBManager;
import db.Employee;

@WebServlet(value = "/task_1_2")
public class Task_01_2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print(
                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">");
        out.println("</head>");
        out.print("<body>");
        out.print("<table class = 'table table-striped '>");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>NAME</th>");
        out.print("<th>SURNAME</th>");
        out.print("<th>DEPARTMENT</th>");
        out.print("<th>SALARY</th>");
        out.print("</tr>");
        out.print("</thead>");
        out.print("<tbody>");

        for (Employee employee : DBManager.employees) {
            out.print("<tr>");
            out.print("<td>" + employee.getName() + "</td>");
            out.print("<td>" + employee.getSurname() + "</td>");
            out.print("<td>" + employee.getDepartment() + "</td>");
            out.print("<td>" + employee.getSalary() + "</td>");
            out.print("</tr>");
        }
        out.print("</tbody>");
        out.print("</table>");

        out.print("</body>");
        out.print("</html>");
    }
}
