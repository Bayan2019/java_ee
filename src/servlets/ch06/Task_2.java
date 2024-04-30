package servlets.ch06;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/cookies/task_2")
public class Task_2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String applicationName = request.getParameter("applicationName");
        Cookie cookieApplicationName = new Cookie("applicationName", applicationName);
        cookieApplicationName.setMaxAge(3600*24*30);
        response.addCookie(cookieApplicationName);

        String applicationSurname = request.getParameter("applicationSurname");
        Cookie cookieApplicationSurname = new Cookie("applicationSurname", applicationSurname);
        cookieApplicationSurname.setMaxAge(3600*24*30);
        response.addCookie(cookieApplicationSurname);

        String applicationCountry = request.getParameter("applicationCountry");
        Cookie cookieApplicationCountry = new Cookie("applicationCountry", applicationCountry);
        cookieApplicationCountry.setMaxAge(3600*24*30);
        response.addCookie(cookieApplicationCountry);

        String applicationPhone = request.getParameter("applicationPhone");
        Cookie cookieApplicationPhone = new Cookie("applicationPhone", applicationPhone);
        cookieApplicationPhone.setMaxAge(3600*24*30);
        response.addCookie(cookieApplicationPhone);

        response.sendRedirect("/cookies");
    }
}
