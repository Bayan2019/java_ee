package servlets.ch06;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/cookies/task_1")
public class Task_1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie cookies[] = request.getCookies();

        String myCookieValue = "Default Site Name";

        if (cookies!=null) {
            for(Cookie c: cookies) {
                if (c.getName().equals("siteName")) {
                    myCookieValue=c.getValue().toString();
                    break;
                }
            }
        }

        request.setAttribute("siteName", myCookieValue);
        request.getRequestDispatcher("/html/cookies.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String siteName = request.getParameter("siteName");
        Cookie cookie = new Cookie("siteName", siteName.toString());
        response.addCookie(cookie);

        response.sendRedirect("/cookies");
    }
}
