package project;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/project")
public class Main extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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

        request.setAttribute("language", language);

        request.getRequestDispatcher("/html/projectMain.jsp").forward(request, response);
    }
}
