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
                    <h1>Welcome <%=user.getFullName()%>!</h1>

                    <table class="table-group-divider">
                        <tbody>
                            <tr>
                                <td><strong>Email:  </strong></td>
                                <td><%=user.getEmail()%></td>
                            </tr>
                            <tr>
                                <td><strong>Role:  </strong></td>
                                <td><%=(user.getRole_id()==1) ? "author" : "reader"%></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </main>
    </body>
</html>
