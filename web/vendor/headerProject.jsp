<%@ page import="db.User" %><%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/21/24
  Time: 03:32
  To change this template use File | Settings | File Templates.
--%>
<nav class="navbar navbar-expand-sm" style="background-color: <%=headerBackground%>; color: <%=headerColor%>;">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">
            <img src="https://raw.githubusercontent.com/Bayan2019/project02/main/images/logos3.png" alt="SAPAR" height="35" />
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse navbar-project" id="navbarScroll">
            <ul class="navbar-nav my-lg-0 navbar-nav-scroll navbar-links" style="--bs-scroll-height: 100px;">
                <li class="nav-item">
                    <a class="nav-link" href="/project">All News</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/project/category?id=1">Culture</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/project/category?id=2">Sport</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/project/category?id=3">Finance</a>
                </li>
            </ul>
        </div>
        <%
            User user = (User) request.getSession().getAttribute("currentUser");
            if (user!=null) {
                %>
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link reference icon-link mt-sm-0" style="font-size: 24px;" href="/project/profile">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-circle" viewBox="0 0 16 16">
                        <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0"/>
                        <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8m8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1"/>
                    </svg>
                </a>
            </li>
            <li class="nav-item">
                <a class="reference icon-link mt-sm-0 danger-zone" href="/project/logout" style="font-size: 24px;">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-box-arrow-right" viewBox="0 0 16 16">
                        <path fill-rule="evenodd" d="M10 12.5a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-9a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v2a.5.5 0 0 0 1 0v-2A1.5 1.5 0 0 0 9.5 2h-8A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-2a.5.5 0 0 0-1 0z"/>
                        <path fill-rule="evenodd" d="M15.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 0 0-.708.708L14.293 7.5H5.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708z"/>
                    </svg>
                </a>
            </li>
        </ul>
        <%
            } else {
        %>
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link reference icon-link mt-sm-0" href="/project/register"
                   style="font-size: 24px;">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-plus-fill" viewBox="0 0 16 16">
                        <path d="M1 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6"/>
                        <path fill-rule="evenodd" d="M13.5 5a.5.5 0 0 1 .5.5V7h1.5a.5.5 0 0 1 0 1H14v1.5a.5.5 0 0 1-1 0V8h-1.5a.5.5 0 0 1 0-1H13V5.5a.5.5 0 0 1 .5-.5"/>
                    </svg>
                </a>
            </li>
            <li class="nav-item">
                <a class="reference icon-link mt-sm-0" href="/project/login" style="font-size: 24px;">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-box-arrow-in-right" viewBox="0 0 16 16">
                        <path fill-rule="evenodd" d="M6 3.5a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v9a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-2a.5.5 0 0 0-1 0v2A1.5 1.5 0 0 0 6.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-8A1.5 1.5 0 0 0 5 3.5v2a.5.5 0 0 0 1 0z"/>
                        <path fill-rule="evenodd" d="M11.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 1 0-.708.708L10.293 7.5H1.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708z"/>
                    </svg>
                </a>
            </li>
        </ul>
        <%
            }
        %>
    </div>
</nav>