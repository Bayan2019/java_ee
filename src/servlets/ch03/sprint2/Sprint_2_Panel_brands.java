package servlets.ch03.sprint2;

import db.Brand;
import db.DBConnector;
import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/sprint_2/panel/brands")
public class Sprint_2_Panel_brands extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("user", DBConnector.getUser(id));

        request.setAttribute("brands", DBConnector.getAllBrands());

        request.getRequestDispatcher("/html/ch03/sprint2/sprint2PanelBrands.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("user", DBConnector.getUser(id));

        String name = request.getParameter("brandName");
        String country = request.getParameter("brandCountry");

        DBConnector.addBrand(new Brand(name, country));

        request.setAttribute("brands", DBConnector.getAllBrands());

        request.getRequestDispatcher("/html/ch03/sprint2/sprint2PanelBrands.jsp").forward(request, response);
    }
}
