<%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/21/24
  Time: 03:32
  To change this template use File | Settings | File Templates.
--%>

<%--<div class="header">--%>
<%--        <img src="https://raw.githubusercontent.com/Bayan2019/project02/main/images/logos3.png" alt="SAPAR" />--%>
<%--        <h1>Java EE</h1>--%>
<%--</div>--%>
<%
    String navbarBackground="#249474";
    String navbarColor="#a4c1ad";
%>
<nav class="navbar navbar-expand-sm" style="background-color: <%=navbarBackground%>; color: <%=navbarColor%>;">
    <div class="container-fluid">
        <a class="navbar-brand" style="color: white" href="/">
            BITLAB SHOP
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarScroll">
            <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                <li class="nav-item">
                    <a class="nav-link" href="#">ADD ITEM</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
