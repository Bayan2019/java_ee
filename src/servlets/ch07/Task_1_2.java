package servlets.ch07;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value = "/sessions/task_1_2")
public class Task_1_2 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String task1City = request.getParameter("task1City");
        String task1Address = request.getParameter("task1Address");
        String task1Phone = request.getParameter("task1Phone");

        HttpSession session = request.getSession();

        session.setAttribute("task1City", task1City);
        session.setAttribute("task1Address", task1Address);
        session.setAttribute("task1Phone", task1Phone);

        session.setAttribute("stage", "3");

        response.sendRedirect("/sessions");
    }
}
