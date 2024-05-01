package servlets.ch03.sprint2;

import db.Brand;
import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/sprint_2/details/items")
public class Sprint_2_Details_item extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("user", DBConnector.getUser(id));

        Long item_id = Long.parseLong(request.getParameter("item_id"));
        request.setAttribute("item", DBConnector.getItem(item_id));

        request.setAttribute("brands", DBConnector.getAllBrands());

        request.getRequestDispatcher("/html/ch03/sprint2/sprint2DetailsItem.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("user", DBConnector.getUser(id));

        Long item_id = Long.parseLong(request.getParameter("item_id"));
        String name = request.getParameter("itemName");
        String description = request.getParameter("itemDescription");
        Double price = Double.parseDouble(request.getParameter("itemPrice"));
        Long brand_id = Long.parseLong(request.getParameter("itemBrand"));

        DBConnector.updateItem(item_id, name, description, price, brand_id);

        request.setAttribute("brands", DBConnector.getAllBrands());
        request.setAttribute("items", DBConnector.getAllItems());

        request.getRequestDispatcher("/html/ch03/sprint2/sprint2PanelItems.jsp").forward(request, response);
    }
}
