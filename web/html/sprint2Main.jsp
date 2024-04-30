<%@ page import="db.Item" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="db.DBConnector" %>
<%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/22/24
  Time: 01:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <%@include file="/vendor/meta.jsp"%>
        <%@include file="/links/links.jsp"%>
        <%@include file="/vendor/styleBitlab.jsp"%>
    </head>
    <body>
        <%@include file="/vendor/headerSprint2.jsp"%>
        <main>
            <figure class="text-center">
                <blockquote class="blockquote">
                <p>Welcome to BITLAB SHOP</p>
                </blockquote>
                <figcaption class="blockquote-footer">
                    Electronic devices with high quality and service
                </figcaption>
            </figure>
            <div class="row row-cols-1 row-cols-md-3 g-4">
                <%
                    ArrayList<Item> items = (ArrayList<Item>) request.getAttribute("items");
                    for (Item item: items) {
                        %>
                <div class="col">
                    <div class="card text-center mb-3 h-100">
                        <div class="card-header" style="background-color: <%=navbarColor%>">
                            <h5 style="color: <%=brandColor%>;">
                                <%=item.getName()%>
                            </h5>
                        </div>
                        <div class="card-body" style="color: <%=navbarBackground%>">
                            <h5 class="card-title" style="color: <%=moneyColor%>">
                                $<%=item.getPrice()%>
                            </h5>
                            <p class="card-text"><%=item.getDescription()%></p>
                            <a href="#" class="btn money">
                                Buy Now
                            </a>
                        </div>
                    </div>
                </div>
                <%
                    }
                %>
            </div>
        </main>
    </body>
</html>
