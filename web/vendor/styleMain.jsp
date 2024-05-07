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
    String navbar2Background = "#c7f8cb";
    String bodyColor = "#34577a";
    String fieldsetBackground = "#48cae4";
    String fieldsetLegend = "#3B7813";
    String fieldsetColor = "#043707";
    String buttonColor = "#850000";
    String buttonHover = "#B5F08E";
    String btnDangerLightBackground = "#ff4dff";
    String buttonHover2 = "#4df698";
    String dangerZoneHover = "#f12d41";
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
        margin: 3px;
    }
    main button.btn-danger {
        font-weight: 700;
        padding: 3px 12px;
        margin: 4px;
        border-radius: 5px;
        color: <%=bodyBackground%>;
        background-color: red;
        border: red solid 3px
    }
    main button.btn-danger:hover {
        background-color: <%=btnDangerLightBackground%>;
        color: red;
    }
    main button.btn {
        font-weight: 700;
        padding: 3px 12px;
        margin: 4px;
        border-radius: 5px;
        background-image: radial-gradient(<%=fieldsetLegend%>, <%=headerColor%>);
        color: <%=bodyBackground%>;
        border: <%=headerColor%> solid 3px;
    }
    main button.btn:hover {
        background-image: radial-gradient(<%=headerColor%>, <%=buttonHover2%>);
        color: <%=bodyBackground%>;
        border: <%=fieldsetLegend%> solid 3px;
    }
    main .btn {
        font-weight: 700;
        padding: 3px 12px;
        margin: 4px;
        border-radius: 5px;
        background-image: radial-gradient(<%=fieldsetLegend%>, <%=headerColor%>);
        color: <%=bodyBackground%>;
        border: <%=headerColor%> solid 3px;
    }
    main .btn:hover {
        background-image: radial-gradient(<%=headerColor%>, <%=buttonHover2%>);
        color: <%=bodyBackground%>;
        border: <%=fieldsetLegend%> solid 3px;
    }
    .nav-item form {
        padding: 0;
        margin: 0;
    }
    .ul-reference {
        background-color: <%=navbar2Background%>;
    }
    .reference {
        border: none;
        color: <%=bodyColor%>;
        background: transparent;
        padding: var(--bs-nav-link-padding-y) var(--bs-nav-link-padding-x);;
    }
    .reference:hover {
        color: greenyellow;
        background: transparent;
    }
    .navbar-project {
        max-width: 300px;
        min-width: 300px;
    }
    .ul-languages {
        padding-left: 8px;
    }
    .select-language {
        background: transparent;
        border-radius: 2px;
        border: none;
    }
    .card-footer {
        background-color: #cee5f2;
        color: #6279b8;
    }
    svg {
        vertical-align: middle;
    }
    .danger-zone:hover {
        color: <%=dangerZoneHover%>;
    }
    .talk-bubble {
        float: left;
    }
    .talk-bubble-you {
        float: right;
    }
    .talktext{
        padding: 7px;
        border-top-left-radius: 0;
        border-top-right-radius: 12px;
        border-bottom-left-radius: 12px;
        border-bottom-right-radius: 12px;
        float: left;
        border: 3px solid #05668d;
    }
    .talktext-you{
        padding: 7px;
        border-top-left-radius: 12px;
        border-top-right-radius: 0;
        border-bottom-left-radius: 12px;
        border-bottom-right-radius: 12px;
        float: right;
        border: 3px solid #679436;
    }
    .sec {
        margin-bottom: 1px;
        font-size: 12px;
    }
    .comments {
        display: flex;
        flex-direction: column;
    }
</style>
