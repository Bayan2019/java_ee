package ch03.sprint2;

import db.Brand;
import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/sprint_2/details/brands")
public class Sprint_2_Details_brand extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("user", DBConnector.getUser(id));

        Long brand_id = Long.parseLong(request.getParameter("brand_id"));
        request.setAttribute("brand", DBConnector.getBrand(brand_id));

        request.getRequestDispatcher("/html/sprint2DetailsBrand.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("user", DBConnector.getUser(id));

        Long brand_id = Long.parseLong(request.getParameter("brand_id"));
        String name = request.getParameter("brandName");
        String country = request.getParameter("brandCountry");

        DBConnector.updateBrand(brand_id, name, country);

        request.setAttribute("brands", DBConnector.getAllBrands());

        request.getRequestDispatcher("/html/sprint2PanelBrands.jsp").forward(request, response);
    }
}
