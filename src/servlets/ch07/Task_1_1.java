package servlets.ch07;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value = "/sessions/task_1_1")
public class Task_1_1 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String task1Name = request.getParameter("task1Name");
        String task1Surname = request.getParameter("task1Surname");
        String task1Age = request.getParameter("task1Age");

        HttpSession session = request.getSession();

        session.setAttribute("task1Name", task1Name);
        session.setAttribute("task1Surname", task1Surname);
        session.setAttribute("task1Age", task1Age);

        session.setAttribute("stage", "2");

        response.sendRedirect("/sessions");
    }
}
