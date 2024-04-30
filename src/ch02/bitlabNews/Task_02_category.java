package ch02.bitlabNews;

import db.DBManager;
import db.News;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@WebServlet(value = "/bitlab_news/category")
public class Task_02_category extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int category = Integer.parseInt(request.getParameter("category"));
//        Set<int> categories = Set.of(1, 2, 3);
//        if (categories.contains(category)) {
//            DBManager.setSomeNews(DBManager.getCategoryNews(category));
//        }
        ArrayList<News> someNews = DBManager.getCategoryNews(category);
        request.setAttribute("someNews", someNews);

        request.getRequestDispatcher("/html/bitlabNewsCategory.jsp").forward(request, response);
    }
}
