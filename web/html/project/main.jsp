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
            <button type="button" data-bs-toggle="modal" data-bs-target="#formAddNews" class="btn">
                + Add News
            </button>
            <div class="modal" tabindex="-1" id="formAddNews">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">NEW NEWS</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form action="/project/add-news" method="post">
                            <div class="modal-body">
                                <label>TITLE</label>
                                <input type="text" name="newsTitle" class="form-control" /> <br>
                                <label>CATEGORY</label>
                                <select name="newsCategory" class="form-control">
                                    <%
                                        ArrayList<Category> categories = (ArrayList<Category>) request.getAttribute("categories");
                                        for (Category category: categories) {
                                    %>
                                    <option value="<%=category.getId()%>">
                                        <%=category.getName()%>
                                    </option>
                                    <%
                                        }
                                    %>
                                </select><br>
                                <label>LANGUAGE</label>
                                <select name="newsLanguage" class="form-control">
                                    <%
                                        for (Language language: languages) {
                                    %>
                                    <option value="<%=language.getId()%>">
                                        <%=language.getName()%>
                                    </option>
                                    <%
                                        }
                                    %>
                                </select><br>
                                <label>CONTENT</label>
                                <textarea rows="5" name="newsContent" class="form-control"></textarea>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">CLOSE</button>
                                <button type="submit" class="btn btn-primary">ADD</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
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
                    <%=n.getPost_date().toString()%>
                </div>
            </div>
            <%
                }
            %>

        </main>
    </body>
</html>
