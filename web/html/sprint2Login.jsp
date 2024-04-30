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
            <br/>
            <%
                Boolean errorLogin = (Boolean) request.getAttribute("errorLogin");
                if (errorLogin) {
                    System.out.println("Inside toast");
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
            <br/>
            <form action="/sprint_2/login" method="post">
                <label for="email">Email:</label>
                <input type="email" name="email" id="email" required>
                <label for="password">Password:</label>
                <input type="password" name="password" id="password" required>
                <button type="submit">LOG IN</button>
            </form>
        </main>
    </body>
</html>
