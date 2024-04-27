<%@ page import="db.Item" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="db.Student" %>
<%@ page import="db.DBConnector" %><%--
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
//                    ArrayList<Student> students = DBConnector.getAllStudents();
                    Student student = (Student) request.getAttribute("student");
                    if (student!=null) {
                %>
                <tr>
                    <td>NAME</td>
                    <td style="color: <%=navbarBackground%>;">
                        <strong><%=student.getName()%></strong>
                    </td>
                </tr>
                <tr>
                    <td>SURNAME</td>
                    <td style="color: <%=navbarBackground%>;">
                        <strong><%=student.getSurname()%></strong>
                    </td>
                </tr>
                <tr>
                    <td>BIRTHDATE</td>
                    <td style="color: <%=navbarBackground%>;">
                        <strong><%=student.getBirthdate()%></strong>
                    </td>
                </tr>
                <tr>
                    <td>CITY</td>
                    <td style="color: <%=navbarBackground%>;">
                        <strong><%=student.getCity().getName()%></strong>
                    </td>
                </tr>
                <%
                    }
                %>
                </tbody>
            </table>
            <a class="btn" role="button" href="/bitlab_academy/edit?id=<%=student.getId()%>">
                EDIT
            </a>
        </main>
    </body>
</html>
