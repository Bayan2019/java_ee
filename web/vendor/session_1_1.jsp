<%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/27/24
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/sessions/task_1_1" method="post">
    <h2>STEP 1</h2>

    <label for="task1Name">NAME: </label>
    <input id="task1Name" name="task1Name" type="text" class="form-control">

    <label for="task1Surname">SURNAME: </label>
    <input id="task1Surname" name="task1Surname" type="text" class="form-control">

    <label for="task1Age">AGE: </label>
    <input id="task1Age" name="task1Age" type="number" class="form-control">

    <button class="btn btn-success">NEXT</button>
</form>