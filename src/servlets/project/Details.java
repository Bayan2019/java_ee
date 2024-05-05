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

@WebServlet(value = "/project/details")
public class Details extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        News news = DBConnector.getNews(id);
        if (news.getId()==null) {
            request.getRequestDispatcher("/html/project/502.jsp").forward(request, response);
        } else {
            request.setAttribute("news", news);
            request.getRequestDispatcher("/html/project/details.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
