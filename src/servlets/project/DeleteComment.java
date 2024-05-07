package servlets.project;

import db.Comment;
import db.DBConnector;
import db.News;
import db.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/project/delete-comment")
public class DeleteComment extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("currentUser");
        Long id = Long.parseLong(request.getParameter("id"));

        Comment comment = DBConnector.getComment(id);

        if (user.getId()!=comment.getAuthor().getId()) {
            request.setAttribute("languages", DBConnector.getAllLanguages());
            request.getRequestDispatcher("/html/project/403.jsp").forward(request, response);
        } else {

            DBConnector.deleteComment(id);
            response.sendRedirect("/project/details?id="+comment.getNews().getId());
        }
    }
}
