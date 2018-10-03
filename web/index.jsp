<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018.5.8
  Time: 上午 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    这是索引界面<br>
    <button onclick="Location.href='<%=request.getContextPath()%>/init.jsp';">Init</button>
    <button onclick="Location.href='<%=request.getContextPath()%>/destory.jsp';">Destory</button>
  </body>
</html>
<%--request.getAttribute()和reques.getParameter()得到区别： request.getAttribute()
只能通过 request.setAttribute("name",参数)来获取； reques.getParameter()则通过URL参数，或前链接页面关系的参数来获取--%>