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
                News news = (News) request.getAttribute("news");
            %>
            <h3>
                <%=news.getTitle()%>
            </h3>
            <h5>
                by <%=news.getAuthor().getFullName()%>
            </h5>
            <h6>
                at <%=news.getPost_date().toString()%>
            </h6>
            <div>
                <%=news.getContent()%>
            </div>
            <%
                if (user!=null) {
                    if (user.getId()==news.getAuthor().getId()) {
                        %>
            <div class="d-inline-flex">
                <a class="btn" href="/project/edit-news?id=<%=news.getId()%>">EDIT</a>
                <button type="button" class="btn-danger" data-bs-toggle="modal" data-bs-target="#deleteNews">
                    DELETE
                </button>
            </div>
            <div class="modal" tabindex="-1" id="deleteNews">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">CONFIRM DELETE</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form action="/project/delete-news" method="post">
                            <div class="modal-body">
                                <input type="hidden" name="id" value="<%=news.getId()%>" />
                                <h3>Are you sure?</h3>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">CANCEL</button>
                                <button type="submit" class="btn-danger">DELETE</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <%
                    }
                }
            %>
        </main>
    </body>
</html>
