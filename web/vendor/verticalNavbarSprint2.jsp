<%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/27/24
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-1 vertical-navbar">
    <!-- Tab navs -->
    <div class="nav flex-column nav-pills" role="tablist" aria-orientation="vertical">
        <a class="nav-link" href="/sprint_2/panel/items?id=<%=user.getId()%>" role="tab">
            Products
        </a>
        <a class="nav-link" href="/sprint_2/panel/brands?id=<%=user.getId()%>" role="tab">
            Brands
        </a>
    </div>
    <!-- Tab navs -->
</div>