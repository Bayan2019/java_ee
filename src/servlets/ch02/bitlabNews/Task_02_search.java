package servlets.ch02.bitlabNews;

import db.DBManager;
import db.News;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/bitlab_news/search")
public class Task_02_search extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String search = request.getParameter("search");

        ArrayList<News> someNews = DBManager.getSearchNews(search);
        request.setAttribute("someNews", someNews);

        request.getRequestDispatcher("/html/ch02/bitlabNews/bitlabNewsCategory.jsp").forward(request, response);
    }
}
