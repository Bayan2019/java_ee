<%@ page import="db.User" %><%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/21/24
  Time: 03:32
  To change this template use File | Settings | File Templates.
--%>
<%
    User user = (User) request.getAttribute("user");
%>
<nav class="navbar navbar-expand-sm">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">
            BITLAB SHOP
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarScroll">
            <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                <li class="nav-item">
                    <a class="nav-link" href="#">Top Sales</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">New Sales</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">By Category</a>
                </li>
            </ul>
        </div>
        <ul class="navbar-nav me-auto my-2 my-lg-0">
            <li class="nav-item">
                <form action="/sprint_2/panel/items" method="get" class="reference">
                    <input type="hidden" name="id" value="<%=user.getId()%>">
                    <button class="nav-link reference">Admin Panel</button>
                </form>
            </li>
            <li class="nav-item">
                <form action="/sprint_2/profile" method="get" class="reference">
                    <input type="hidden" name="id" value="<%=user.getId()%>">
                    <button class="nav-link reference">Profile</button>
                </form>
            </li>
            <li class="nav-item">
                <form action="/sprint_2" method="get" class="reference">
                    <input type="hidden" name="id" value="<%=user.getId()%>">
                    <button class="nav-link reference">Sign Out</button>
                </form>
            </li>
        </ul>
    </div>
</nav>
