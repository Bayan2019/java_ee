<%@ page import="db.Country" %>
<%@ page import="db.DBConnector" %>
<%@ page import="db.Translations" %><%--
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
            <h1>Chapter 7. Sessions -- HttpSesssion interface</h1>
            <h3>Task 1</h3>
            <p>
                Create an application where you fill out a form step by step.
                You will create multiple pages, and each page will have different shapes.
                Clicking  the NEXT button will take you to the next stage of filling out the form.
                After filling, we click on the FINISH button,
                where we will receive the result of our completed forms.
                Use a session to save form data.
            </p>
            <%
                String stage = (String) request.getAttribute("stage");
                if (stage=="1") {
            %>
            <%@include file="/vendor/session_1_1.jsp"%>
            <%
                } else if (stage=="2") {
            %>
            <%@include file="/vendor/session_1_2.jsp"%>
            <%
                } else if (stage=="3") {
            %>
            <%@include file="/vendor/session_1_3.jsp"%>
            <%
                } else if (stage=="finish") {
            %>
            <%@include file="/vendor/session_1_finish.jsp"%>
            <%
                }
            %>

            <h3>Task 2</h3>

            <p>
                Create a web application in which I can view a list of products in a store.
            </p>

            <p>
                It turns out that I should have a ready-made list of products,
                which I display on the main page.
            </p>

            <p>
                I need to be able to add an item to my cart every time.
                You must store the cart in a session.
                It turns out that I will have an array of products in my session.
            </p>

            <p>
                As a result, I should be able to see all the items in my cart.
                Products may be repeated, if for example I want to buy 2 or 3 adidas sneakers.
            </p>
    </body>
</html>
