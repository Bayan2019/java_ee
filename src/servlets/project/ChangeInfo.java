package servlets.project;

import db.DBConnector;
import db.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/project/profile/change-info")
public class ChangeInfo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = (User) request.getSession().getAttribute("currentUser");

        if (user==null) {
            request.setAttribute("languages", DBConnector.getAllLanguages());
            request.getRequestDispatcher("/html/project/403.jsp").forward(request, response);
        } else {
            request.setAttribute("languages", DBConnector.getAllLanguages());
            request.getRequestDispatcher("/html/project/changeInfo.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = (User) request.getSession().getAttribute("currentUser");

        String fullName = request.getParameter("fullName");
        int role_id = Integer.parseInt(request.getParameter("role_id"));

        DBConnector.updateUserInfo(user.getId(), fullName, role_id);
        User newUser = DBConnector.getUser(user.getId());
        request.getSession().setAttribute("currentUser", newUser);

        response.sendRedirect("/project/profile");
    }
}
