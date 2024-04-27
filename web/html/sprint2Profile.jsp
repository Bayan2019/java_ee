<%@ page import="db.Item" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="db.DBConnector" %>
<%@ page import="db.User" %>
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
            <figure class="text-center">
                <blockquote class="blockquote">
                    <p>Hello <%=user.getFullName()%>></p>
                </blockquote>
                <figcaption class="blockquote-footer">
                    This your profile page
                </figcaption>
            </figure>
        </main>
    </body>
</html>
