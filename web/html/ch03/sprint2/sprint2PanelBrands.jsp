<%@ page import="java.util.ArrayList" %>
<%@ page import="db.Brand" %>
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
        <%@include file="/vendor/headerSprint2_2.jsp"%>
        <main>
            <div class="row">
                <%@include file="/vendor/verticalNavbarSprint2.jsp"%>
                <div class="col-9">
                    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#form">
                        + Add Brand
                    </button>
                    <div class="modal" tabindex="-1" id="form">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">NEW Brand</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                </div>
                                <form action="/sprint_2/panel/brands" method="post">
                                    <input type="hidden" name="id" value="<%=user.getId()%>"/>
                                    <div class="modal-body">
                                        <label>NAME</label>
                                        <input type="text" name="brandName" /> <br>
                                        <label>COUNTRY</label>
                                        <input type="text" name="brandCountry" /> <br>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">CLOSE</button>
                                        <button type="submit" class="btn btn-primary">ADD</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <!-- Tab content -->
                    <div class="tab-content">
                        <div class="tab-panel" role="tabpanel">
                            <table class = 'table table-striped '>
                                <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>NAME</th>
                                    <th>COUNTRY</th>
                                    <th>DETAILS</th>
                                </tr>
                                </thead>
                                <tbody>
                                <%
                                    ArrayList<Brand> brands = (ArrayList<Brand>) request.getAttribute("brands");
                                    if (brands!=null) {
                                        for (Brand brand: brands) {
                                %>
                                <tr>
                                    <td><%=brand.getId()%></td>
                                    <td><%=brand.getName()%></td>
                                    <td><%=brand.getCountry()%></td>
                                    <td>
                                        <form action="/sprint_2/details/brands" method="get">
                                            <input type="hidden" name="id" value="<%=user.getId()%>">
                                            <input type="hidden" name="brand_id" value="<%=brand.getId()%>">
                                            <button type="submit">DETAILS</button>
                                        </form>
                                    </td>
                                </tr>
                                <%
                                        }
                                    }
                                %>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <!-- Tab content -->
                </div>
            </div>
        </main>
    </body>
</html>
