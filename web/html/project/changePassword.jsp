<%@ page import="db.News" %>
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
        <%@include file="/vendor/headerProject.jsp"%>
        <%@include file="/vendor/navbarSearchLanguages.jsp"%>
        <main>
            <div class="row">
                <%@include file="/vendor/verticalNavbarProject.jsp"%>
                <div class="col-9">
                    <%
                        Boolean errorPassword = (Boolean) request.getAttribute("errorPassword");
                        if (errorPassword) {
                    %>
                    <div class="toast show" role="alert" aria-live="assertive" aria-atomic="true"
                         style="background-color: <%=btnDangerLightBackground%>; color: red;">
                        <div class="d-flex">
                            <div class="toast-body">
                                Wrong Password!
                            </div>
                            <button type="button" class="btn-close me-2 m-auto" data-bs-dismiss="toast" aria-label="Close"></button>
                        </div>
                    </div>
                    <%
                        }
                    %>
                    <form action="/project/profile/change-password" method="post">
                        <label>OLD PASSWORD</label>
                        <input type="password" name="oldPassword" class="form-control"><br>
                        <label>NEW PASSWORD</label>
                        <input type="password" name="newPassword" class="form-control"><br>
                        <button class="btn">CHANGE</button>
                    </form>
                </div>
            </div>
        </main>
    </body>
</html>
