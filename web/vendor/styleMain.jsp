<%--
  Created by IntelliJ IDEA.
  User: bayan
  Date: 4/22/24
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%
    String bodyBackground = "#ade8f4";
    String headerBackground = "#57CC98";
    String headerColor = "#05668d";
    String fieldsetBackground = "#48cae4";
    String fieldsetLegend = "#3B7813";
    String fieldsetColor = "#043707";
    String buttonColor = "#850000";
    String buttonHover = "#B5F08E";
%>
<link rel="icon" type="image/x-icon" href="https://raw.githubusercontent.com/Bayan2019/project02/main/images/logos4.png" />
<title>Java EEs</title>
<style>
    #headerSearch {
        background-color: <%=headerColor%>;
        color: <%=headerBackground%>;
        border-radius: 5px;
    }
    #headerSearch:hover {
        background-color: greenyellow;
    }
    main {
        padding: 12px;
    }
    main form {
        border: <%=fieldsetColor%> solid;
        border-radius: 10px;
        padding: 5px;
    }
    main form button {
        font-weight: 700;
        padding: 3px 12px;
        margin: 4px;
        border-radius: 5px;
        background-image: radial-gradient(<%=fieldsetLegend%>, <%=headerColor%>);
        color: <%=bodyBackground%>;
        border: <%=headerColor%> solid 3px;
    }
    main form button:hover {
        background-image: radial-gradient(<%=headerColor%>, <%=fieldsetLegend%>);
        color: <%=bodyBackground%>;
        border: <%=fieldsetLegend%> solid 3px;
    }
</style>
