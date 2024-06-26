package servlets.ch06;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/cookies/task_3")
public class Task_3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String language = request.getParameter("language");
        Cookie cookieLanguage = new Cookie("cookieLanguage", language);
        cookieLanguage.setMaxAge(3600*24*30*3);
        response.addCookie(cookieLanguage);

        response.sendRedirect("/cookies");
    }
}
