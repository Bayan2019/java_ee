package servlets.ch02.bitlabShop;

import db.DBManager;

import db.Item;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/bitlab_shop/add_item")
public class Task_02_AddItem extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/html/bitlabShopAddItem.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("itemName");
        double price = Double.parseDouble(request.getParameter("itemPrice"));
        int amount = Integer.parseInt(request.getParameter("itemAmount"));

        Long id = DBManager.getAllItems().getLast().getId()+1;

        DBManager.addItem(new Item(id, name, price, amount));

        response.sendRedirect("/bitlab_shop");
    }
}
