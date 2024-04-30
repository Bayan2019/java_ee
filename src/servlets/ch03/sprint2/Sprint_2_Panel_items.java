package servlets.ch03.sprint2;

import db.Brand;
import db.DBConnector;
import db.Item;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/sprint_2/panel/items")
public class Sprint_2_Panel_items extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("user", DBConnector.getUser(id));

        request.setAttribute("brands", DBConnector.getAllBrands());
        request.setAttribute("items", DBConnector.getAllItems());

        request.getRequestDispatcher("/html/sprint2PanelItems.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("user", DBConnector.getUser(id));

        String name = request.getParameter("itemName");
        double price = Double.parseDouble(request.getParameter("itemPrice"));
        Long brand_id = Long.parseLong(request.getParameter("itemBrand"));
        String description = request.getParameter("itemDescription");

        DBConnector.addItem(new Item(name, description, price, brand_id));

        request.setAttribute("brands", DBConnector.getAllBrands());
        request.setAttribute("items", DBConnector.getAllItems());

        request.getRequestDispatcher("/html/sprint2PanelItems.jsp").forward(request, response);
    }
}
