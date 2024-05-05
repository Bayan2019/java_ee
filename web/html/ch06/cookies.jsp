<%@ page import="db.Country" %>
<%@ page import="db.Translations" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/21/24
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <%@include file="/vendor/meta.jsp"%>
        <%@include file="/links/links.jsp"%>
        <%@include file="/vendor/styleMain.jsp"%>
    </head>
    <body>
        <%@include file="/vendor/headerMain.jsp"%>
        <main>
            <h1>Chapter 6. Cookie</h1>
            <h3>Task 1</h3>
            <p>
                Create a WEB application using  servlets  and  jsp .
                I enter text into the form and submit the form.
                My task is to save the text in a cookie so that the value is displayed on
                the main page as the site title ( <code>&lttitle&gt</code> ).
                If the cookie doesn't exist, then I enter <strong>"Default Site Name"</strong> instead.
                Save the cookies for about a month.
            </p>
            <%
                String siteName= (String) request.getAttribute("siteName");
            %>
            <form action="/cookies/task_1" method="post">
                <label for="siteValue">ENTER NAME:</label>
                <input type="text" name="siteName" id="siteValue" value="<%=siteName%>"/>
                <button class="btn btn-success">SET SITE NAME</button>
            </form>

            <h3>Task 2</h3>
            <p>
                Create a WEB application using  servlets  and  jsp .
                I have a questionnaire form, when filling it out I can save the data as a draft.
                The application must save data in cookies, that is, record it for at least 1 month.
            </p>
            <%
                String applicationName = (String) request.getAttribute("applicationName");
                String applicationSurname = (String) request.getAttribute("applicationSurname");
                String applicationCountry = (String) request.getAttribute("applicationCountry");
                String applicationPhone = (String) request.getAttribute("applicationPhone");
            %>
            <form action="/cookies/task_2" method="post">
                <label for="applicationName">NAME: </label>
                <input type="text" id="applicationName" name="applicationName" value="<%=applicationName%>" /> <br>

                <label for="applicationSurname">SURNAME: </label>
                <input TYPE="text" name="applicationSurname" id="applicationSurname" value="<%=applicationSurname%>"/><br>

                <label for="applicationCountry">COUNTRY</label>
                <select name="applicationCountry" id="applicationCountry">
                    <%
                        ArrayList<Country> countries = (ArrayList<Country>) request.getAttribute("countries");
                        for (Country country: countries) {
                            %>
                    <option <%=country.getCode().equals(applicationCountry) ? "selected" : ""%>
                        value="<%=country.getCode()%>">
                        <%=country.getName()%>
                    </option>
                    <%
                        }
                    %>
                </select><br>
                <label for="applicationPhone">PHONE NUMBER:</label>
                <input name="applicationPhone" id="applicationPhone" value="<%=applicationPhone%>"/><br>

                <button class="btn btn-secondary">SAVE TO DRAFT</button>
            </form>

            <h3>Task 3</h3>
            <p>
                Create a WEB application using  servlets  and  jsp  in which I can select the language.
                I will store an array of data (translations) in Russian and English in a special class.
            </p>

            <%@include file="/vendor/navbarLanguages.jsp"%>
            <%
                int language = Integer.parseInt((String) request.getAttribute("language"));
            %>
            <form>
                <label><strong><%=Translations.translations.get(language).get(0)%>: </strong></label>
                <input type="text"><br>
                <br>
                <label><strong><%=Translations.translations.get(language).get(1)%>: </strong></label>
                <input type="number"><br>
                <br>
                <label><strong><%=Translations.translations.get(language).get(2)%>: </strong></label>
                <select>
                    <%
                        for (Country country:countries) {
                            %>
                    <option value="<%=country.getCode()%>"><%=country.getName()%></option>
                    <%
                        }
                    %>
                </select><br>
                <br>
                <label><strong><%=Translations.translations.get(language).get(3)%>: </strong></label><br>
                <input type="radio" value="male" id="cookies-gender-male">
                <label for="cookies-gender-male"><%=Translations.translations.get(language).get(6)%></label><br>
                <input type="radio" value="female" id="cookies-gender-female">
                <label for="cookies-gender-female"><%=Translations.translations.get(language).get(7)%></label><br>
                <br>
                <label><strong><%=Translations.translations.get(language).get(4)%>: </strong></label>
                <input type="text"><br>
                <br>
                <button class="btn"><%=Translations.translations.get(language).get(5)%></button>
            </form>
        </main>
    </body>
</html>
