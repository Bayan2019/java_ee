package servlets.project;

import db.DBConnector;
import db.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value = "/project/logout")
public class Logout extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getSession().removeAttribute("currentUser");

        response.sendRedirect("/project");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("projectLoginEmail");
        String password = request.getParameter("projectLoginPassword");

        User user = DBConnector.getUserByEmailPassword(email, password);

        if (user.getId()==null) {
            request.setAttribute("errorLogin", true);
            request.getRequestDispatcher("/html/projectLogin.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", user);

            response.sendRedirect("/project");
            //request.getRequestDispatcher("/html/projectProfile.jsp").forward(request, response);
        }
    }
}
