package ch07;

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

        HttpSession session1 = request.getSession();
        session1.setAttribute("task1Name", task1Name);

        response.sendRedirect("/sessions");
    }
}
