<%@ page import="db.Item" %><%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/23/24
  Time: 02:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <%@include file="/vendor/meta.jsp"%>
        <%@include file="/links/links.jsp"%>
        <%@include file="/vendor/styleBitlabShop.jsp"%>
    </head>
    <body>
        <%@include file="/vendor/headerBitlab.jsp"%>
        <main>
            <%
                Item item = (Item) request.getAttribute("item");
                if (item!=null) {
            %>
            <h2>NAME</h2>
            <h3><%=item.getName()%></h3>
            <h2>PRICE</h2>
            <h3><%=item.getPrice()%></h3>
            <h2>AMOUNT</h2>
            <h3><%=item.getAmount()%></h3>
            <%
                }
            %>
        </main>
    </body>
</html>
