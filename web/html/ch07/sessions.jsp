<%@ page import="db.*" %><%--
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
            <h2>Task 1</h2>
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

            <br>
            <br>

            <h2>Task 2</h2>

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

            <%
                ArrayList<Item> items = (ArrayList<Item>) request.getAttribute("items");
                ArrayList<Item> basketItems = (ArrayList<Item>) request.getAttribute("basketItems");
            %>

            <div class="row">
                <div class="col-5">
                    <h4>PRODUCTS</h4>
                    <%
                        for (Item item:items) {
                            %>
                    <div class="card">
                        <div class="card-header">
                            <%=item.getName()%>
                        </div>
                        <form class="card-body" action="/sessions/basket" method="post">
                            <h5 class="card-title"><%=item.getPrice()%> $</h5>
                            <input type="hidden" name="item_id" value="<%=item.getId()%>">
                            <button class="btn btn-primary">ADD TO CARD</button>
                        </form>
                    </div> <br>
                    <%
                        }
                    %>
                </div>

                <div class="vr"></div>

                <div class="col-5">
                    <h4>BASKET</h4>
                    <%
                        for (Item item:basketItems) {
                    %>
                    <div class="card">
                        <div class="card-header">
                            <%=item.getName()%>
                        </div>
                        <div class="card-body">
                            <h5 class="card-title"><%=item.getPrice()%> $</h5>
                        </div>
                    </div> <br>
                    <br>
                    <%
                        }
                    %>
                </div>
            </div>

        </main>
    </body>
</html>
