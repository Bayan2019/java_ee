package servlets.ch03.sprint2;

import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/sprint_2")
public class Sprint_2_Main extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("items", DBConnector.getAllItems());

        request.getRequestDispatcher("/html/ch03/sprint2/sprint2Main.jsp").forward(request, response);
    }
}
