package servlets.project;

import db.DBConnector;
import db.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(value = "/project/login")
public class Login extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("errorLogin", false);

        request.getRequestDispatcher("/html/project/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("projectLoginEmail");
        String password = request.getParameter("projectLoginPassword");

        User user = DBConnector.getUserByEmailPassword(email, password);

        if (user.getId()==null) {
            request.setAttribute("errorLogin", true);
            request.getRequestDispatcher("/html/project/login.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", user);
            response.sendRedirect("/project/profile");
        }
    }
}
