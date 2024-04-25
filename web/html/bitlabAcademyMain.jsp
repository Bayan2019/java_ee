<%@ page import="db.Item" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="db.DBManager" %>
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
                <thead>
                <tr>
                    <th>ID</th>
                    <th>NAME</th>
                    <th>SURNAME</th>
                    <th>BIRTHDATE</th>
                    <th>CITY</th>
                    <th>DETAILS</th>
                </tr>
                </thead>
                <tbody>
                <%
                    ArrayList<Student> students = DBConnector.getAllStudents();
                    if (students!=null) {
                        for (Student student: students) {
                %>
                <tr>
                    <td><%=student.getId()%></td>
                    <td><%=student.getName()%></td>
                    <td><%=student.getSurname()%></td>
                    <td><%=student.getBirthdate()%></td>
                    <td><%=student.getCity()%></td>
                    <td><a href="/bitlab_academy/details?id=<%=student.getId()%>" class="btn btn-sm">DETAILS</a></td>
                </tr>
                <%
                        }
                    }
                %>
                </tbody>
            </table>
        </main>
    </body>
</html>
