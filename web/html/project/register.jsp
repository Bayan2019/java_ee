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
                Boolean errorRegister = (Boolean) request.getAttribute("errorRegisterMail");
                if (errorRegister) {
            %>
            <div class="toast show" role="alert" aria-live="assertive" aria-atomic="true"
                 style="background-color: <%=btnDangerLightBackground%>; color: red;">
                <div class="d-flex">
                    <div class="toast-body">
                        Email is already used by another User!
                    </div>
                    <button type="button" class="btn-close me-2 m-auto" data-bs-dismiss="toast" aria-label="Close"></button>
                </div>
            </div>
            <%
                }
            %>
            <%
                Boolean errorRegisterPasswords = (Boolean) request.getAttribute("errorRegisterPasswords");
                if (errorRegisterPasswords) {
            %>
            <div class="toast show" role="alert" aria-live="assertive" aria-atomic="true"
                 style="background-color: <%=btnDangerLightBackground%>; color: red;">
                <div class="d-flex">
                    <div class="toast-body">
                        Passwords don't match!
                    </div>
                    <button type="button" class="btn-close me-2 m-auto" data-bs-dismiss="toast" aria-label="Close"></button>
                </div>
            </div>
            <%
                }
            %>
            <form action="/project/register" method="post">
                <label for="projectRegisterEmail">EMAIL* : </label>
                <input id="projectRegisterEmail" name="projectRegisterEmail"
                       type="text" class="form-control" required><br>

                <label for="projectRegisterPassword">PASSWORD* : </label>
                <input id="projectRegisterPassword" name="projectRegisterPassword"
                       type="password" class="form-control" required><br>

                <label for="projectRegisterPassword2">RETYPE PASSWORD* : </label>
                <input id="projectRegisterPassword2" name="projectRegisterPassword2"
                       type="password" class="form-control" required><br>

                <label for="projectRegisterFullName">FULL NAME : </label>
                <input id="projectRegisterFullName" name="projectRegisterFullName" type="text" class="form-control"><br>

                <button class="btn">Register</button>
            </form>
        </main>
    </body>
</html>
