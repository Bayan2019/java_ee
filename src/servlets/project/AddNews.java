package servlets.project;

import db.DBConnector;
import db.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/project/add-news")
public class AddNews extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("currentUser");

        if (user.getRole_id()!=1) {
            request.getRequestDispatcher("/html/project/403.jsp").forward(request, response);
        } else {
            String title = request.getParameter("newsTitle");
            int category_id = Integer.parseInt(request.getParameter("newsCategory"));
            int language_id = Integer.parseInt(request.getParameter("newsLanguage"));
            String content = request.getParameter("newsContent");

            content = "<p>" + content + "</p>";
            content = content.replace("\n\n", "<p>\n\n</p>");

            DBConnector.addNews(title, content, category_id, language_id, user.getId());
            response.sendRedirect("/project");
        }
    }
}
