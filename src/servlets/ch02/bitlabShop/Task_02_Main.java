package servlets.ch02.bitlabShop;

import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/bitlab_shop")
public class Task_02_Main extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("items", DBManager.getAllItems());
        request.getRequestDispatcher("/html/ch02/bitlabShop/bitlabShopMain.jsp").forward(request, response);
    }
}
