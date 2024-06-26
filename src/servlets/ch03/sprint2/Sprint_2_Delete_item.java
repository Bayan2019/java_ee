package servlets.ch03.sprint2;

import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/sprint_2/delete/items")
public class Sprint_2_Delete_item extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("user", DBConnector.getUser(id));

        Long item_id = Long.parseLong(request.getParameter("item_id"));

        DBConnector.deleteItem(item_id);

        request.setAttribute("brands", DBConnector.getAllBrands());
        request.setAttribute("items", DBConnector.getAllItems());

        request.getRequestDispatcher("/html/ch03/sprint2/sprint2PanelItems.jsp").forward(request, response);
    }
}
