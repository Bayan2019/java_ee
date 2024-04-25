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
<nav class="navbar navbar-expand-sm" style="background-color: <%=headerBackground%>; color: <%=headerColor%>;">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">
            <img src="https://raw.githubusercontent.com/Bayan2019/project02/main/images/logos3.png" alt="SAPAR" height="35" />
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarScroll">
            <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                <li class="nav-item">
                    <a class="nav-link" href="/html/ch01.jsp">Basics</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        JSP
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/bitlab_shop">BITLAB SHOP</a></li>
                        <li><a class="dropdown-item" href="/bitlab_news">BITLAB NEWS</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="/html/sprint1Main.jsp">Sprint Task 1</a></li>
                    </ul>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        JDBC
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/bitlab_academy">BITLAB ACADEMY</a> </li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="/sprint_2">Sprint Task 2</a></li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Cookies</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Sessions</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Project</a>
                </li>
            </ul>
            <form class="d-flex mt-3" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button id="headerSearch" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
