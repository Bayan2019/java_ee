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

@WebServlet(value = "/project/register")
public class Register extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("errorRegister", false);

        request.getRequestDispatcher("/html/project/projectRegister.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("projectRegisterEmail");
        String password = request.getParameter("projectRegisterPassword");
        String fullName = request.getParameter("projectRegisterFullName");

        if (DBConnector.getUserEmails().contains(email)) {
            request.setAttribute("errorRegister", true);
            request.getRequestDispatcher("/html/project/projectRegister.jsp").forward(request, response);
        } else {
            User user = new User(email, password, fullName);
            DBConnector.addUser(user);
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", DBConnector.getUserByEmailPassword(email, password));
            response.sendRedirect("/profile");
        }
    }
}
