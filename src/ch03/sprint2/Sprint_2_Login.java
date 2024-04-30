package ch03.sprint2;

import db.DBConnector;
import db.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/sprint_2/login")
public class Sprint_2_Login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("errorLogin", false);
        request.getRequestDispatcher("/html/sprint2Login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = DBConnector.getUserByEmailPassword(email, password);

        if (user.getId()==null) {
            request.setAttribute("errorLogin", true);
            request.getRequestDispatcher("/html/sprint2Login.jsp").forward(request, response);
        } else {
            request.setAttribute("user", user);
            request.getRequestDispatcher("/html/sprint2Profile.jsp").forward(request, response);
        }
    }
}
