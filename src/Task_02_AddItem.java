import db.DBManager;

import db.Item;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/bitlab_shop_add_item")
public class Task_02_AddItem extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        request.setAttribute("items", DBManager.getAllItems());
        request.getRequestDispatcher("/html/bitlabShopAddItem.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        request.setAttribute("items", DBManager.getAllItems());
        String name = request.getParameter("itemName");
        double price = Double.parseDouble(request.getParameter("itemPrice"));
        int amount = Integer.parseInt(request.getParameter("itemAmount"));

        int id = DBManager.getAllItems().getLast().getId()+1;

        DBManager.addItem(new Item(id, name, price, amount));

        request.getRequestDispatcher("/html/bitlabShopMain.jsp").forward(request, response);
    }
}
