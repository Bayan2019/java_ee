<%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/21/24
  Time: 03:32
  To change this template use File | Settings | File Templates.
--%>

<nav class="navbar navbar-expand-sm"
     style="background-color: <%=navbarAcademyBackground%>;">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">
            <img src="https://portal.bitlab.kz/pluginfile.php/1/core_admin/logocompact/300x300/1682147778/logo_bitlab_header.png" alt="BITLAB" height="60px" />
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarScroll">
            <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll"
                style="--bs-scroll-height: 100px;">
                <li class="nav-item">
                    <a class="nav-link academy" href="/bitlab_academy">Students</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link academy" href="/bitlab_news/cities">Cities</a>
                </li>
            </ul>
            <form class="d-flex mt-3" role="search" action="/bitlab_news/search" method="post">
                <input class="form-control me-2" type="search" name="search" placeholder="Search" aria-label="Search">
                <button id="headerSearch" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
