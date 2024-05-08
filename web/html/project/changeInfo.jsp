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
            <div class="row">
                <%@include file="/vendor/verticalNavbarProject.jsp"%>
                <div class="col-9">
                    <form action="/project/profile/change-info" method="post">
                        <label>FULL NAME</label>
                        <input type="text" name="fullName" class="form-control" value="<%=user.getFullName()%>"><br>
                        <label>ROLE</label>
                        <select class="form-control" name="role_id">
                            <option value="1" <%=(user.getRole_id()==1) ? "selected" : ""%>>
                                Author
                            </option>
                            <option value="1" <%=(user.getRole_id()==2) ? "selected" : ""%>>
                                Reader
                            </option>
                        </select>
                        <button class="btn">CHANGE</button>
                    </form>
                </div>
            </div>
        </main>
    </body>
</html>
