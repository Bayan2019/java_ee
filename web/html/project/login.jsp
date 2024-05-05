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
            <%
                Boolean errorLogin = (Boolean) request.getAttribute("errorLogin");
                if (errorLogin) {
            %>
            <div class="toast show" role="alert" aria-live="assertive" aria-atomic="true"
                 style="background-color: <%=btnDangerLightBackground%>; color: red;">
                <div class="d-flex">
                    <div class="toast-body">
                        Wrong parameters!
                    </div>
                    <button type="button" class="btn-close me-2 m-auto" data-bs-dismiss="toast" aria-label="Close"></button>
                </div>
            </div>
            <%
                }
            %>
            <form action="/project/login" method="post">
                <label for="projectLoginEmail">EMAIL: </label>
                <input id="projectLoginEmail" name="projectLoginEmail" type="text" class="form-control"><br>

                <label for="projectLoginPassword">PASSWORD: </label>
                <input id="projectLoginPassword" name="projectLoginPassword" type="password" class="form-control"><br>

                <button class="btn">Sign In</button>
            </form>
        </main>
    </body>
</html>
