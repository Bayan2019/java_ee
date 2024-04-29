<%@ page import="db.News" %>
<%@ page import="db.DBConnector" %><%--
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
                int language = Integer.parseInt((String) request.getAttribute("language"));
                System.out.println(language);
                for (News n: DBConnector.getNewsByLanguage(language)) {
                    %>
            <div class="card" style="margin: 10px">
                <div class="card-header">
                    <%=n.getTitle()%>
                </div>
                <div class="card-body">
                    <h6 class="card-title">by <%=n.getAuthor()%></h6>
                    <div class="card-text"><%=n.getContent()%></div>
                </div>
                <div class="card-footer text-body-secondary">
                    <%=n.getPost_date().toString()%>
                </div>
            </div>

            <%
                }
            %>

        </main>
    </body>
</html>
