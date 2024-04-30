package servlets.ch01;

import db.DBManager;
import db.Footballer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/task_1_7")
public class Task_01_7 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("playerName");
        String surname = request.getParameter("playerSurname");
        String club = request.getParameter("playerClub");
        int salary = Integer.parseInt(request.getParameter("playerSalary"));
        int transferPrice = Integer.parseInt(request.getParameter("playerTransferPrice"));

        int amount = db.DBManager.getAllFootballers().size();
        db.DBManager.addFootballer(new Footballer(Long.valueOf(amount+1), name, surname, salary, club, transferPrice));

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print(
                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">");
        out.println("</head>");
        out.print("<body>");

        for (Footballer player : DBManager.getAllFootballers()) {
            out.print("<h1 class='text-success'>" + player.getName() + " " + player.getSurname() + "</h1>");
            out.print("<h2 class='text-primary'>Club: " + player.getClub() + "</h2>");
            out.print("<h2 class='text-danger'>Club: " + player.getSalary() + " EUR</h2>");
            out.print("<h2 class='text-danger'>Club: " + player.getTransferPrice() + " EUR</h2>");
            out.print("<br />");
            out.print("<br />");
        }

        out.print("</body>");
        out.print("</html>");
    }
}
