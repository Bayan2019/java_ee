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

        request.setAttribute("languages", DBConnector.getAllLanguages());
        request.setAttribute("errorRegisterMail", false);
        request.setAttribute("errorRegisterPasswords", false);

        request.getRequestDispatcher("/html/project/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("projectRegisterEmail");
        String password = request.getParameter("projectRegisterPassword");
        String password2 = request.getParameter("projectRegisterPassword2");
        String fullName = request.getParameter("projectRegisterFullName");

        if (DBConnector.getUserEmails().contains(email)) {
            request.setAttribute("languages", DBConnector.getAllLanguages());
            request.setAttribute("errorRegisterMail", true);
            request.setAttribute("errorRegisterPasswords", false);
            request.getRequestDispatcher("/html/project/register.jsp").forward(request, response);
        } else if (!password.equals(password2)) {
            request.setAttribute("languages", DBConnector.getAllLanguages());
            request.setAttribute("errorRegisterMail", false);
            request.setAttribute("errorRegisterPasswords", true);
            request.getRequestDispatcher("/html/project/register.jsp").forward(request, response);
        } else {
            User user = new User(email, password, fullName);
            DBConnector.addUser(user);
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", DBConnector.getUserByEmailPassword(email, password));
            response.sendRedirect("/project/profile");
        }
    }
}
