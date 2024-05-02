<%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/27/24
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String task1Name = (String) request.getSession().getAttribute("task1Name");
    String task1Surname = (String) request.getSession().getAttribute("task1Surname");
    String task1Age = (String) request.getSession().getAttribute("task1Age");
    String task1City = (String) request.getSession().getAttribute("task1City");
    String task1Address = (String) request.getSession().getAttribute("task1Address");
    String task1Phone = (String) request.getSession().getAttribute("task1Phone");
    String task1University = (String) request.getSession().getAttribute("task1University");
    String task1Faculty = (String) request.getSession().getAttribute("task1Faculty");
    String task1Group = (String) request.getSession().getAttribute("task1Group");
%>
<form>
    <strong>NAME: <%=task1Name%></strong><br>
    <strong>SURNAME: <%=task1Surname%></strong><br>
    <strong>AGE: <%=task1Age%></strong><br>

    <strong>CITY: <%=task1City%></strong><br>
    <strong>ADDRESS: <%=task1Address%></strong><br>
    <strong>PHONE: <%=task1Phone%></strong><br>

    <strong>UNIVERSITY: <%=task1University%></strong><br>
    <strong>FACULTY: <%=task1Faculty%></strong><br>
    <strong>GROUP: <%=task1Group%></strong><br>
</form>