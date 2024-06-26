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

@WebServlet(value = "/sessions")
public class Sessions extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String stage = (String) request.getSession().getAttribute("stage");
        if (stage==null) {
            stage = "1";
        }

        request.setAttribute("stage", stage);
        request.setAttribute("cities", DBConnector.getAllCities());
        request.setAttribute("items", DBConnector.getAllItems());

        ArrayList<Item> basketItems = (ArrayList<Item>) request.getSession().getAttribute("basketItems");
        if (basketItems==null) {
            basketItems = new ArrayList<>();
        }

        request.setAttribute("basketItems", basketItems);

        request.getRequestDispatcher("/html/ch07/sessions.jsp").forward(request, response);
    }
}
