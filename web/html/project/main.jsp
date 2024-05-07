<%@ page import="db.News" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="db.Category" %>
<%@ page import="db.Language" %><%--
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
                if (user!=null) {
                    if (user.getRole_id()==1) {
                    %>
            <a href="/project/add-news" class="btn">
                + Add News
            </a>
            <%
                    }
                }
            %>
            <%
                ArrayList<News> someNews = (ArrayList<News>) request.getAttribute("someNews");
                for (News n: someNews) {
            %>
            <div class="card" style="margin: 10px">
                <div class="card-header" style="background-color: #39a2a5; color: #c7f8cb;">
                    <a class="text-decoration-none" style="background-color: #39a2a5; color: #c7f8cb;"
                       href="/project/details?id=<%=n.getId()%>">
                        <h5><strong><%=n.getTitle()%></strong></h5>
                    </a>
                </div>
                <div class="card-body" style="background-color: #E7F8F0;">
                    <h6 class="card-title text-body-secondary">by <%=n.getAuthor().getFullName()%></h6>

                </div>
                <div class="card-footer">
                    <%=n.getPost_date().toString().split("\\.")[0]%>
                </div>
            </div>
            <%
                }
            %>

        </main>
    </body>
</html>
