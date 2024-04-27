package ch03.sprint2;

import db.Brand;
import db.DBConnector;
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
        request.setAttribute("id", id);

        request.getRequestDispatcher("/html/sprint2PanelBrands.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("id", id);

        String name = request.getParameter("brandName");
        String country = request.getParameter("brandCountry");

        DBConnector.addBrand(new Brand(name, country));

        request.getRequestDispatcher("/html/sprint2PanelBrands.jsp").forward(request, response);
    }
}
