import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import db.DBManager;

@WebServlet(value = "/bitlab_shop")
public class Task_02_BitlabShop extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        request.setAttribute("items", DBManager.getAllItems());
        request.getRequestDispatcher("/html/bitlabShopMain.jsp").forward(request, response);
    }
}
