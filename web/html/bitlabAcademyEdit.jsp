<%@ page import="db.Student" %><%--
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
            <%
                Student student = (Student) request.getAttribute("student");
            %>
            <form action="/bitlab_academy/edit" method="post" class="with-2-option-and-modal">
                <input type="hidden" name="id" value="<%=student.getId()%>" />

                <label>NAME</label>
                <input type="text" name="studentName" value="<%=student.getName()%>"> <br/>

                <label>SURNAME</label>
                <input type="text" name="studentSurname" value="<%=student.getSurname()%>"> <br/>

                <label>BIRTHDATE</label>
                <input type="date" name="studentBirthdate" value=<%=student.getBirthdate()%> placeholder="<%=student.getBirthdate()%>"> <br />

                <label>CITY</label>
                <input type="text" name="studentCity" value="<%=student.getCity()%>"> <br/>

                <button type="submit" class="btn">SAVE</button>
            </form>
            <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#deleteStudent">
                DELETE
            </button>
            <div class="modal" tabindex="-1" id="deleteStudent">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">CONFIRM DELETE</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form action="/bitlab_academy/delete" method="post">
                            <div class="modal-body">
                                <input type="hidden" name="id" value="<%=student.getId()%>" />
                                <h3>Are you sure?</h3>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">CANCEL</button>
                                <button type="submit" class="btn btn-danger">DELETE</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </main>
    </body>
</html>