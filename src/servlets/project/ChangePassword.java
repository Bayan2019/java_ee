package servlets.project;

import db.DBConnector;
import db.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/project/profile/change-password")
public class ChangePassword extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = (User) request.getSession().getAttribute("currentUser");

        if (user==null) {
            request.setAttribute("languages", DBConnector.getAllLanguages());
            request.getRequestDispatcher("/html/project/403.jsp").forward(request, response);
        } else {
            request.setAttribute("languages", DBConnector.getAllLanguages());
            request.setAttribute("errorPassword", false);
            request.getRequestDispatcher("/html/project/changePassword.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = (User) request.getSession().getAttribute("currentUser");

        String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");
        String password = DBConnector.getUserPassword(user.getId());

        if (!oldPassword.equals(password)) {
            request.setAttribute("languages", DBConnector.getAllLanguages());
            request.setAttribute("errorPassword", true);
            request.getRequestDispatcher("/html/project/changePassword.jsp").forward(request, response);
        } else {

            DBConnector.updateUserPassword(user.getId(), newPassword);

            response.sendRedirect("/project/profile");
        }
    }
}
