package servlets.ch07;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value = "/sessions/task_1_3")
public class Task_1_3 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String task1University = request.getParameter("task1University");
        String task1Faculty = request.getParameter("task1Faculty");
        String task1Group = request.getParameter("task1Group");

        HttpSession session = request.getSession();

        session.setAttribute("task1University", task1University);
        session.setAttribute("task1Faculty", task1Faculty);
        session.setAttribute("task1Group", task1Group);

        session.setAttribute("stage", "finish");

        response.sendRedirect("/sessions");
    }
}
