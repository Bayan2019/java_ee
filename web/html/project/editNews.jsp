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
                News news = (News) request.getAttribute("news");
            %>
            <form action="/project/edit-news" method="post">
                <div class="modal-body">
                    <input type="hidden" name="newsId" value="<%=news.getId()%>">
                    <label>TITLE</label>
                    <input type="text" name="newsTitle" value="<%=news.getTitle()%>" class="form-control" /> <br>
                    <label>CATEGORY</label>
                    <select name="newsCategory" class="form-control">
                        <%
                            ArrayList<Category> categories = (ArrayList<Category>) request.getAttribute("categories");
                            for (Category category: categories) {
                        %>
                        <option <%=news.getCategory().getId()==category.getId() ? "selected" : ""%>
                                value="<%=category.getId()%>">
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
                        <option <%=news.getLanguage().getId()==language.getId() ? "selected" : ""%>
                                value="<%=language.getId()%>">
                            <%=language.getName()%>
                        </option>
                        <%
                            }
                        %>
                    </select><br>
                    <label>CONTENT</label>

                    <textarea rows="5" name="newsContent" class="form-control"><%=news.getContent()%>
                    </textarea>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">CLOSE</button>
                    <button type="submit" class="btn btn-primary">SAVE</button>
                </div>
            </form>
        </main>
    </body>
</html>
