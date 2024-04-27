<%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/22/24
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%
    String navbarBackground="#1b4d3e";
    String navbarColor="#e5e4e2";
    String navbarAcademyBackground="#E3F9F9";
    String brandColor="#00cccc";
    String searchButtonBackground="#09A29D";
    String detailsBackground="#555555";
    String detailsColor="#f0e0d1";
    String btnDangerBackground="#ff4dff";
    String btnDangerLightBackground="#ffc0cb";
    String moneyColor="#009966";
%>
<link rel="icon" type="image/x-icon" href="https://bitlab.kz/images/favicons/android-chrome-144x144.png" />
<title>BITLAB</title>
<style>
    nav {
        background-color: <%=navbarBackground%>;
        color: <%=navbarColor%>;
    }
    nav form {
        border: none;
        padding: 0;
    }
    nav form button {
        background-color: <%=searchButtonBackground%>;
        color: <%=navbarBackground%>;
        border-radius: 5px;
    }
    .nav-link {
        color: <%=navbarColor%>;
    }
    .navbar .container-fluid #navbarScroll .nav-item .academy {
        color: <%=navbarBackground%>;
    }
    .navbar .container-fluid #navbarScroll .nav-item .academy:hover {
        color: <%=brandColor%>;
    }
    .navbar-brand {
        color: <%=brandColor%>;
    }
    main {
        padding: 5px;
    }
    button {
        margin: 3px;
    }
    button, .btn {
        color: <%=navbarColor%>;
        background-color: <%=navbarBackground%>;
    }
    button:hover {
        color: <%=navbarColor%>;
        background-color: <%=brandColor%>;
    }
    button, .btn:hover {
        color: <%=navbarColor%>;
        background-color: <%=brandColor%>;
    }
    .btn-danger {
        background-color: red;
    }
    .btn-danger:hover {
        background-color: <%=btnDangerBackground%>;
    }
    td .btn-sm {
        color: <%=detailsColor%>;
        background-color: <%=detailsBackground%>;
    }
    td .btn-sm:hover {
        color: <%=detailsColor%>;
        background-color: <%=brandColor%>;
    }
    form {
        border-radius: 5px;
        border: <%=brandColor%> solid 2px;
        padding: 6px;
    }
    h3 {
        color: <%=brandColor%>;
    }

    .money {
        background-color: <%=moneyColor%>;
    }
    .money:hover {
        background-color: <%=brandColor%>;
    }
    .vertical-navbar {
        background-color: <%=navbarBackground%>;
    }
    .nav-item form {
        padding: 0;
        margin: 0;
    }
    .reference {
        border: none;
        background: transparent;
        padding: var(--bs-nav-link-padding-y) var(--bs-nav-link-padding-x);;
    }
    .reference:hover {
        color: <%=brandColor%>;
        background: transparent;
    }
</style>
