package servlets.ch02.sprint1;

import db.DBManager;
import db.Task;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/sprint_1/details/save")
public class Sprint_1_Save extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));

        String name = request.getParameter("taskName");
        String description = request.getParameter("taskDescription");

        System.out.println(description);

        String deadlineDate = request.getParameter("taskDeadline");
        String status = request.getParameter("taskStatus");
        Boolean completed = status.equals("yes");

        Task task = DBManager.getTask(id);
        task.setName(name);
        task.setDescription(description);
        task.setDeadlineDate(deadlineDate);
        task.setCompleted(completed);

        int i = DBManager.getTaskIndex(id);
        System.out.println(i);
        DBManager.updateTasks(i, task);

        request.getRequestDispatcher("/html/sprint1Main.jsp").forward(request, response);
    }
}
