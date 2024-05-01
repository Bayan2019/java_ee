package servlets.ch02.bitlabShop;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import db.DBManager;

@WebServlet(value = "/bitlab_shop/details")
public class Task_02_Details extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("item", DBManager.getItem(id));
        request.getRequestDispatcher("/html/ch02/bitlabShop/bitlabShopDetails.jsp").forward(request, response);
    }
}
