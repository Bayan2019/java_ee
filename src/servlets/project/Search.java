package servlets.project;

import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/project/search")
public class Search extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String search = request.getParameter("search");

        Cookie cookies[] = request.getCookies();

        String language = "1";

        int n=0;

        if (cookies!=null) {
            for(Cookie c: cookies) {
                if (c.getName().equals("cookieLanguage")) {
                    language = c.getValue().toString();
                    n++;
                }
                if (n>=1) {
                    break;
                }
            }
        }

        request.setAttribute("someNews", DBConnector.getNewsBySearch(search, Integer.parseInt(language)));
        request.setAttribute("languages", DBConnector.getAllLanguages());

        request.getRequestDispatcher("/html/project/main.jsp").forward(request, response);
    }
}
