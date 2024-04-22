<%@ page import="db.Item" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="db.DBManager" %><%--
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
        <%@include file="/vendor/styleBitlabShop.jsp"%>
    </head>
    <body>
        <%@include file="/vendor/headerBitlabShop.jsp"%>
        <main>
            <table class = 'table table-striped '>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NAME</th>
                        <th>PRICE</th>
                        <th>AMOUNT</th>
                        <th>DETAILS</th>
                    </tr>
                </thead>
                <tbody>
                <%
                    ArrayList<Item> items = DBManager.getAllItems();
                    System.out.println(request.getAttribute("items"));
                    if (items!=null) {
                        for (Item item: items) {
                        %>
                    <tr>
                        <td><%=item.getId()%></td>
                        <td><%=item.getName()%></td>
                        <td><%=item.getPrice()%></td>
                        <td><%=item.getAmount()%></td>
                        <td><a href="/bitlab_shop/details" class="btn btn-sm">DETAILS</a></td>
                    </tr>
                <%
                        }
                    }
                %>
                </tbody>
            </table>
        </main>
    </body>
</html>
