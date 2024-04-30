<%@ page import="db.*" %>
<%@ page import="java.util.ArrayList" %><%--
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
        <%@include file="/vendor/headerSprint2_2.jsp"%>
        <main>
            <%
                Item item = (Item) request.getAttribute("item");
            %>
            <form action="/sprint_2/details/items" method="post">
                <input type="hidden" name="id" value="<%=user.getId()%>" />
                <input type="hidden" name="item_id" value="<%=item.getId()%>" />

                <label>NAME</label>
                <input type="text" name="itemName" value="<%=item.getName()%>"> <br/>

                <label>BRAND</label>
                <select name="itemBrand">
                    <%
                        ArrayList<Brand> brands = (ArrayList<Brand>) request.getAttribute("brands");
                        for (Brand brand: DBConnector.getAllBrands()) {
                    %>
                    <option <%=item.getBrand().getId().equals(brand.getId()) ? "selected" : ""%>
                            value="<%=brand.getId()%>">
                        <%=brand.getName()%>
                    </option>
                    <%
                        }
                    %>
                </select><br>
                <label>PRICE</label>
                <input type="number" step="0.01" name="itemPrice" value="<%=item.getPrice()%>" /><br>
                <label>DESCRIPTION</label>
                <textarea name="itemDescription" rows="4"></textarea> <br>

                <button type="submit" class="btn">SAVE</button>
                <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#deleteStudent">
                    DELETE
                </button>
            </form>
            <div class="modal" tabindex="-1" id="deleteStudent">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">CONFIRM DELETE</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form action="/sprint_2/delete/items" method="post">
                            <div class="modal-body">
                                <input type="hidden" name="id" value="<%=user.getId()%>" />
                                <input type="hidden" name="item_id" value="<%=item.getId()%>" />
                                <h3>Are you sure?</h3>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">CANCEL</button>
                                <button type="submit" class="btn btn-danger">DELETE</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </main>
    </body>
</html>
