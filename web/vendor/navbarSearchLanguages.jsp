<%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/29/24
  Time: 04:27
  To change this template use File | Settings | File Templates.
--%>
<nav class="navbar navbar-expand-sm ul-reference">
    <div class="container-fluid">
        <form class="d-flex mx-lg-auto mt-3 header-search input-group" role="search" action="/project/search">
            <input class="form-control me-lg-auto rounded" type="search" placeholder="Search" aria-label="Search" name="search">
            <button id="headerSearch" type="submit">Search</button>
        </form>
        <ul class="navbar-nav me-auto my-2 my-lg-0" style="--bs-scroll-height: 100px; margin-left: 5px; margin-right: 2px">
<%--        <form action="/project/language" method="get" class="d-flex mx-lg-auto mt-3 ul-languages">--%>
<%--            <select name="language" class="select-language ul-languages">--%>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-globe" viewBox="0 0 16 16">
                        <path d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8m7.5-6.923c-.67.204-1.335.82-1.887 1.855A8 8 0 0 0 5.145 4H7.5zM4.09 4a9.3 9.3 0 0 1 .64-1.539 7 7 0 0 1 .597-.933A7.03 7.03 0 0 0 2.255 4zm-.582 3.5c.03-.877.138-1.718.312-2.5H1.674a7 7 0 0 0-.656 2.5zM4.847 5a12.5 12.5 0 0 0-.338 2.5H7.5V5zM8.5 5v2.5h2.99a12.5 12.5 0 0 0-.337-2.5zM4.51 8.5a12.5 12.5 0 0 0 .337 2.5H7.5V8.5zm3.99 0V11h2.653c.187-.765.306-1.608.338-2.5zM5.145 12q.208.58.468 1.068c.552 1.035 1.218 1.65 1.887 1.855V12zm.182 2.472a7 7 0 0 1-.597-.933A9.3 9.3 0 0 1 4.09 12H2.255a7 7 0 0 0 3.072 2.472M3.82 11a13.7 13.7 0 0 1-.312-2.5h-2.49c.062.89.291 1.733.656 2.5zm6.853 3.472A7 7 0 0 0 13.745 12H11.91a9.3 9.3 0 0 1-.64 1.539 7 7 0 0 1-.597.933M8.5 12v2.923c.67-.204 1.335-.82 1.887-1.855q.26-.487.468-1.068zm3.68-1h2.146c.365-.767.594-1.61.656-2.5h-2.49a13.7 13.7 0 0 1-.312 2.5m2.802-3.5a7 7 0 0 0-.656-2.5H12.18c.174.782.282 1.623.312 2.5zM11.27 2.461c.247.464.462.98.64 1.539h1.835a7 7 0 0 0-3.072-2.472c.218.284.418.598.597.933M10.855 4a8 8 0 0 0-.468-1.068C9.835 1.897 9.17 1.282 8.5 1.077V4z"/>
                    </svg>
                </a>
                <ul class="dropdown-menu">
                    <li>
                        <form action="/project/languages" method="post" class="reference">
                            <input type="hidden" name="language" value="1">
                            <button class="nav-link reference">EN</button>
                        </form>
                    </li>
                    <li>
                        <form action="/project/languages" method="post" class="reference">
                            <input type="hidden" name="language" value="2">
                            <button class="nav-link reference">KZ</button>
                        </form>
                    </li>
                    <li>
                        <form action="/project/languages" method="post" class="reference">
                            <input type="hidden" name="language" value="3">
                            <button class="nav-link reference">ES</button>
                        </form>
                    </li>
                </ul>
            </li>
        </ul>
<%--            </select>--%>
<%--        </form>--%>
    </div>
</nav>