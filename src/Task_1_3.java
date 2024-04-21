import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/task_1_3")
public class Task_1_3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("studentName");
        String surname = request.getParameter("studentSurname");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<h1>" + name + " " + surname + "</h1>");
    }
}
