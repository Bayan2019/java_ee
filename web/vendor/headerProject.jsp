<%--
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
                    <a class="nav-link" href="#">Culture</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Sport</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Cinema</a>
                </li>
            </ul>
        </div>
        <form class="d-flex mx-lg-auto mt-3 header-search input-group" role="search">
            <input class="form-control me-lg-auto rounded" type="search" placeholder="Search" aria-label="Search">
            <button id="headerSearch" type="submit">Search</button>
        </form>
        <ul class="navbar-nav">
            <li class="nav-item">
                <form action="/project/register" method="get" class="reference">
                    <input type="hidden" name="id" value="something">
                    <button class="nav-link reference">Register</button>
                </form>
            </li>
            <li class="nav-item">
                <form action="/project/login" method="get" class="reference">
                    <input type="hidden" name="id" value="something">
                    <button class="nav-link reference">Login</button>
                </form>
            </li>
        </ul>
    </div>
</nav>
