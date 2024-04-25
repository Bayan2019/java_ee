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
            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#form">
                + Add Student
            </button>
            <div class="modal" tabindex="-1" id="form">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">NEW STUDENT</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form action="/bitlab_academy" method="post">
                            <div class="modal-body">
                                <label>NAME</label>
                                <input type="text" name="studentName" /> <br>
                                <label>SURNAME</label>
                                <input type="text" name="studentSurname" /> <br>
                                <label>BIRTHDATE</label>
                                <input type="date" name="studentBirthdate" /> <br>
                                <label>CITY</label>
                                <input type="text" name="studentCity" />
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">CLOSE</button>
                                <button type="submit" class="btn btn-primary">ADD</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
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
//                    ArrayList<Student> students = DBConnector.getAllStudents();
                    ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("students");
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
