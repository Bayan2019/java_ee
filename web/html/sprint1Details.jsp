<%@ page import="db.Task" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="db.DBManager" %><%--
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
            <%
                Task task = (Task) request.getAttribute("task");
            %>
            <form action="/sprint_1/details/save?id=<%=task.getId()%>" method="post">
                <label>NAME</label>
                <input type="text" name="taskName" value="<%=task.getName()%>"> <br/>

                <label>DESCRIPTION</label>
                <textarea name="taskDescription" class="form-control" style="height: 100px">
                    <%=task.getDescription()%>
                </textarea>
                <br />
<%--                <input type="text" name="taskDescription" value="<%=task.getDescription()%>"> <br/>--%>

                <label>DEADLINE</label>
                <input type="date" name="taskDeadline" value=<%=task.getDeadlineDate()%> placeholder="<%=task.getDeadlineDate()%>"> <br />

                <label>COMPLETED</label>
                <select name="taskStatus">
                    <option value='<%=(task.getCompleted() ? "yes" : "no")%>'><%=(task.getCompleted() ? "YES" : "NO")%></option>
                    <option value='<%=(!task.getCompleted() ? "yes" : "no")%>'><%=(!task.getCompleted() ? "YES" : "NO")%></option>
                </select>
                <button type="submit">SAVE</button>
                <button type="submit" formaction="/sprint_1/details/delete?id=<%=task.getId()%>">DELETE</button>
            </form>
        </main>
    </body>
</html>
