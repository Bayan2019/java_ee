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

@WebServlet(value = "/project/edit-news")
public class UpdateNews extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("currentUser");
        Long id = Long.parseLong(request.getParameter("id"));

        News news = DBConnector.getNews(id);

        if (user==null) {
            request.setAttribute("languages", DBConnector.getAllLanguages());
            request.getRequestDispatcher("/html/project/403.jsp").forward(request, response);
        } else {
            if (user.getId() != news.getAuthor().getId()) {
                request.setAttribute("languages", DBConnector.getAllLanguages());
                request.getRequestDispatcher("/html/project/403.jsp").forward(request, response);
            } else {
                request.setAttribute("news", news);
                request.setAttribute("languages", DBConnector.getAllLanguages());
                request.setAttribute("categories", DBConnector.getAllCategories());
                request.getRequestDispatcher("/html/project/editNews.jsp").forward(request, response);
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("currentUser");
        Long id = Long.parseLong(request.getParameter("newsId"));

        News news = DBConnector.getNews(id);

        if (user==null) {
            request.setAttribute("languages", DBConnector.getAllLanguages());
            request.getRequestDispatcher("/html/project/403.jsp").forward(request, response);
        } else {
            if (user.getId() != news.getAuthor().getId()) {
                request.setAttribute("languages", DBConnector.getAllLanguages());
                request.getRequestDispatcher("/html/project/403.jsp").forward(request, response);
            } else {
                String title = request.getParameter("newsTitle");
                int category_id = Integer.parseInt(request.getParameter("newsCategory"));
                int language_id = Integer.parseInt(request.getParameter("newsLanguage"));
                String content = request.getParameter("newsContent");

                DBConnector.updateNews(id, title, content, category_id, language_id, user.getId());
                response.sendRedirect("/project/details?id=" + news.getId());
            }
        }
    }
}
