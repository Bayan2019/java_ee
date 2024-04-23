import db.DBManager;
import db.Task;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.LoggingPermission;

@WebServlet(value = "/sprint_1/details")
public class Sprint_1_Details extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("task", DBManager.getTask(id));
        request.getRequestDispatcher("/html/sprint1Details.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        String action = request.getParameter("action");

        if (action=="save") {
            String name = request.getParameter("taskName");
            String description = request.getParameter("taskDescription");
            String deadlineDate = request.getParameter("taskDeadline");
            String status = request.getParameter("taskStatus");
            Boolean completed = (status == "yes");

            Task task = DBManager.getTask(id);
            task.setName(name);
            task.setDescription(description);
            task.setDeadlineDate(deadlineDate);
            task.setCompleted(completed);

            int i = DBManager.getTaskIndex(id);
            System.out.println(i);
            DBManager.updateTasks(i, task);

        } else if (action=="delete") {
            DBManager.deleteTask(id);
        }
        request.getRequestDispatcher("/html/sprint1Main.jsp").forward(request, response);
    }
}
