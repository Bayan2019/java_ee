package servlets.project;

import db.DBConnector;
import db.News;
import db.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/project/delete-news")
public class DeleteNews extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("currentUser");
        Long id = Long.parseLong(request.getParameter("id"));

        News news = DBConnector.getNews(id);

        if (user.getId()!=news.getAuthor().getId()) {
            request.getRequestDispatcher("/html/project/403.jsp").forward(request, response);
        } else {

            DBConnector.deleteNews(id);
            response.sendRedirect("/project");
        }
    }
}
