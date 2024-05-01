<%--
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
        <%@include file="/vendor/styleBitlab.jsp"%>
    </head>
    <body>
        <%@include file="/vendor/headerBitlabShop.jsp"%>
        <main>
            <form action="/bitlab_shop/add_item" method="post">
                <label>NAME</label>
                <input type="text" name="itemName" class="form-control" />
                <label>PRICE</label>
                <input type="number" step="0.01" name="itemPrice" class="form-control" />
                <label>AMOUNT</label>
                <input type="number" name="itemAmount" class="form-control" />
                <button>ADD ITEM</button>
            </form>
        </main>
    </body>
</html>
