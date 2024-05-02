<%@ page import="java.util.ArrayList" %>
<%@ page import="db.City" %><%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/27/24
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/sessions/task_1_2" method="post">
    <h2>STEP 2</h2>

    <label for="task1City">CITY: </label>
    <%
        ArrayList<City> cities = (ArrayList<City>) request.getAttribute("cities");
    %>
    <select id="task1City" name="task1City" class="form-control">
        <%
            for (City city:cities) {
        %>
        <option value="<%=city.getName()%>"><%=city.getName()%></option>
        <%
            }
        %>
    </select>

    <label for="task1Address">ADDRESS: </label>
    <input id="task1Address" name="task1Address" type="text" class="form-control">

    <label for="task1Phone">PHONE: </label>
    <input id="task1Phone" name="task1Phone" type="text" class="form-control">

    <button class="btn btn-success">NEXT</button>
</form>