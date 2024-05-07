<%@ page import="db.News" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="db.Comment" %>
<%@ page import="java.sql.Timestamp" %>
<%@ page import="java.time.Instant" %><%--
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
            <h1 style="color<%=headerColor%>;">
                <%=news.getTitle()%>
            </h1>
            <div class="row">
                <span class="col text-start" style="color:<%=headerBackground%>;">
                    by <strong><%=news.getAuthor().getFullName()%></strong>
                </span>
                <span class="col text-secondary text-end">
                    <%=news.getPost_date().toString().split("\\.")[0]%>
                </span>
            </div>
            <hr style="background-color: <%=headerColor%>; height: 5px">
            <div>
                <%="<p>"+news.getContent().replace("\n", "</p>\n<p>")+"</p>"%>
            </div>
            <%
                ArrayList<Comment> comments = (ArrayList<Comment>) request.getAttribute("comments");
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
                    %>
            <form class="d-flex mx-lg-auto mt-3 header-search input-group" action="/project/add-comment" method="post">
                <input type="hidden" name="commentNews" value="<%=news.getId()%>">
                <textarea class="form-control me-lg-auto rounded" name="commentComment"></textarea>
                <button type="submit" class="btn">Add Comment</button>
            </form>
            <div class="comments">
            <%
                    for (Comment comment:comments) {
                        if (user.getId() != comment.getAuthor().getId()) {
            %>
                <div class="talk-bubble">
                    <p class="text-secondary text-start sec"><strong><%=comment.getAuthor().getFullName()%></strong> - <%=comment.getPost_date().toString().split("\\.")[0]%></p>
                    <div class="talktext">
                        <%="<p>"+comment.getComment().replace("\n", "</p><p>")+"</p>"%>
                    </div>
                </div><br>
            <%
                        } else {
                        %>
                <div class="talk-bubble-you">
                    <p class="text-secondary text-end sec"><strong><%=comment.getAuthor().getFullName()%></strong> - <%=comment.getPost_date().toString().split("\\.")[0]%></p>
                    <div class="talktext-you">
                        <%="<p>"+comment.getComment().replace("\n", "</p><p>")+"</p>"%>
                        <form action="/project/delete-comment" method="post" style="border: none; float: right">
                            <input type="hidden" name="id" value="<%=comment.getId()%>">
                            <button class="btn-danger" style="font-size: 8px">DELETE</button>
                        </form>
                    </div>
                </div><br>
            <%
                        }
                    }
            %>
            </div>
                <%
                } else {
                    for (Comment comment:comments) {
                    %>
            <div class="comments">
                <div class="talk-bubble">
                    <p class="text-secondary text-start sec"><strong><%=comment.getAuthor().getFullName()%></strong> - <%=comment.getPost_date().toString().split("\\.")[0]%></p>
                    <div class="talktext">
                        <%="<p>"+comment.getComment().replace("\n\n", "</p>\n\n<p>")+"</p>"%>
                    </div>
                </div><br>
            </div>
            <%
                    }
                }
            %>
        </main>
    </body>
</html>
