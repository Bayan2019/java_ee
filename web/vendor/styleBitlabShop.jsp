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
    String brandColor="#00cccc";
    String detailsBackground="#555555";
    String detailsColor="#f0e0d1";
%>
<link rel="icon" type="image/x-icon" href="https://bitlab.kz/images/favicons/android-chrome-144x144.png" />
<title>BITLAB SHOP</title>
<style>
    nav {
        background-color: <%=navbarBackground%>;
        color: <%=navbarColor%>;
    }
    .nav-link {
        color: <%=navbarColor%>;
    }
    .navbar-brand {
        color: <%=brandColor%>;
    }
    button {
        color: <%=navbarColor%>;
        background-color: <%=navbarBackground%>;
    }
    button:hover {
        color: <%=navbarColor%>;
        background-color: <%=brandColor%>;
    }
    td .btn-sm {
        color: <%=detailsColor%>;
        background-color: <%=detailsBackground%>;
    }
    td .btn-sm:hover {
        color: <%=detailsColor%>;
        background-color: <%=navbarBackground%>;
    }
    form {
        margin: 5px;
    }
</style>
