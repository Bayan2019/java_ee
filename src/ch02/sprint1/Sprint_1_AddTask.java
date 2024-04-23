package ch02.sprint1;

import db.DBManager;
import db.Task;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/sprint_1/add_task")
public class Sprint_1_AddTask extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        request.setAttribute("items", DBManager.getAllItems());
        String name = request.getParameter("taskName");
        String description = request.getParameter("taskDescription");
        String deadline = request.getParameter("taskDeadline");
        Long id = DBManager.getAllTaks().getLast().getId()+1;

        DBManager.addTask(new Task(id, name, description, deadline, false));

        request.getRequestDispatcher("/html/sprint1Main.jsp").forward(request, response);
    }
}
