package ch02.bitlabNews;

import db.DBManager;
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
        String category = request.getParameter("category");
        Set<String> categories = Set.of("culture", "sport", "cinema");
        if (categories.contains(category)) {
            DBManager.setSomeNews(DBManager.getCategoryNews(category));
        }
        request.getRequestDispatcher("/html/bitlabNewsCategory.jsp").forward(request, response);
    }
}
