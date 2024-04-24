<%@ page import="db.Item" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="db.DBManager" %>
<%@ page import="db.News" %><%--
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
        <%@include file="/vendor/headerBitlabNews.jsp"%>
        <main>
            <div class="row row-cols-1 row-cols-md-4 g-4">
                <%
                    for (News n:DBManager.getSomeNews()) {
                        %>
                <div class="col">
                    <div class="card h-100">
                        <div class="card-header" style="background-color: <%=navbarColor%>">
                            <h5 style="color: <%=brandColor%>;">
                                <%=n.getTitle()%>
                            </h5>
                        </div>
                        <div class="card-body" style="color: <%=navbarBackground%>">
                            <p class="card-text"><%=n.getContent()%></p>
                        </div>
                        <div class="card-footer" style="color: <%=detailsColor%>; background-color: <%=brandColor%>">
                            by <%=n.getAuthor()%>
                        </div>
                    </div>
                </div>
                <%
                    }
                %>
            </div>
        </main>
    </body>
</html>
