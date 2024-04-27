package ch03.sprint2;

import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/sprint_2/delete/brands")
public class Sprint_2_Delete_brand extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        request.setAttribute("id", id);

        Long brand_id = Long.parseLong(request.getParameter("brand_id"));

        DBConnector.deleteBrand(brand_id);

        request.getRequestDispatcher("/html/sprint2PanelBrands.jsp").forward(request, response);
    }
}
