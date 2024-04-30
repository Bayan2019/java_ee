<%@ page import="db.Task" %>
<%@ page import="java.util.ArrayList" %>
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
        <%@include file="/vendor/styleMain.jsp"%>
    </head>
    <body>
        <%@include file="/vendor/headerSprint1.jsp"%>
        <main>
            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#form">
                + Add Task
            </button>
            <div class="modal" tabindex="-1" id="form">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">NEW TASK</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form action="/sprint_1/add_task" method="post">
                        <div class="modal-body">
                            <label>NAME</label>
                            <input type="text" name="taskName" /> <br>
                            <label>DESCRIPTION</label>
                            <textarea name="taskDescription" class="form-control" style="height: 100px"></textarea>
                            <label>DEADLINE</label>
                            <input type="date" name="taskDeadline" /> <br>
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
                        <th>DEADLINE</th>
                        <th>COMPLETED</th>
                        <th>DETAILS</th>
                    </tr>
                </thead>
                <tbody>
                <%
                    ArrayList<Task> tasks = (ArrayList<Task>) request.getAttribute("tasks");
                    if (tasks!=null) {
                        for (Task task: tasks) {
                        %>
                    <tr>
                        <td><%=task.getId()%></td>
                        <td><%=task.getName()%></td>
                        <td><%=task.getDeadlineDate().toString()%></td>
                        <td><%=task.getCompleted() ? "Yes" : "No"%></td>
                        <td><a href="/sprint_1/details?id=<%=task.getId()%>" class="btn btn-sm">DETAILS</a></td>
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
