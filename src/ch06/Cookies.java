package ch06;

import db.DBConnector;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/cookies")
public class Cookies extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie cookies[] = request.getCookies();

        String siteName = "Default Site Name";
        String applicationName = "Name";
        String applicationSurname = "Surname";
        String applicationCountry = "KAZ";
        String applicationPhone = "Phone";
        String language = "0";

        int n=0;
        if (cookies!=null) {
            for(Cookie c: cookies) {
                if (c.getName().equals("siteName")) {
                    siteName=c.getValue().toString();
                    n++;
                }
                if (c.getName().equals("applicationName")) {
                    applicationName=c.getValue().toString();
                    n++;
                }
                if (c.getName().equals("applicationSurname")) {
                    applicationSurname=c.getValue().toString();
                    n++;
                }
                if (c.getName().equals("applicationCountry")) {
                    applicationCountry=c.getValue().toString();
                    n++;
                }
                if (c.getName().equals("applicationPhone")) {
                    applicationPhone=c.getValue().toString();
                    n++;
                }
                if (c.getName().equals("cookieLanguage")) {
                    language = c.getValue().toString();
                    n++;
                }
                if (n>=6) {
                    break;
                }
            }
        }

        request.setAttribute("countries", DBConnector.getAllCountries());
        request.setAttribute("siteName", siteName);
        request.setAttribute("applicationName", applicationName);
        request.setAttribute("applicationSurname", applicationSurname);
        request.setAttribute("applicationCountry", applicationCountry);
        request.setAttribute("applicationPhone", applicationPhone);
        request.setAttribute("language", language);

        request.getRequestDispatcher("/html/cookies.jsp").forward(request, response);
    }
}
