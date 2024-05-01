<%@ page import="db.City" %>
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
        <%@include file="/vendor/headerBitlabAcademy.jsp"%>
        <main>

            <table class = 'table table-striped '>
                <tbody>
                <%
                    City city = (City) request.getAttribute("city");
                    if (city!=null) {
                %>
                <tr>
                    <td>NAME</td>
                    <td style="color: <%=navbarBackground%>;">
                        <strong><%=city.getName()%></strong>
                    </td>
                </tr>
                <tr>
                    <td>CITY</td>
                    <td style="color: <%=navbarBackground%>;">
                        <strong><%=city.getCode()%></strong>
                    </td>
                </tr>
                <%
                    }
                %>
                </tbody>
            </table>
            <a class="btn" role="button" href="/bitlab_academy/cities/edit?id=<%=city.getId()%>">
                EDIT
            </a>
        </main>
    </body>
</html>
