package servlets.ch07;

import db.DBConnector;
import db.Item;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/sessions/basket")
public class Task_2 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long item_id = Long.parseLong(request.getParameter("item_id"));
        Item item = DBConnector.getItem(item_id);

        ArrayList<Item> basketItems = (ArrayList<Item>) request.getSession().getAttribute("basketItems");
        if (basketItems==null) {
            basketItems = new ArrayList<>();
        }
        basketItems.add(item);

        request.getSession().setAttribute("basketItems", basketItems);

        response.sendRedirect("/sessions");
    }
}
