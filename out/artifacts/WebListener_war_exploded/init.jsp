<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018.5.8
  Time: 下午 5:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

    request.setAttribute("requestName", "requestValue");
    request.getSession().setAttribute("sessionName", "sessionValue");
    request.getSession().getServletContext().setAttribute("contextName", "contextValue");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
   这是初始化界面！<br>
   <button onclick="Location.href='<%=request.getContextPath()%>/init.jsp';">Init</button>
   <button onclick="Location.href='<%=request.getContextPath()%>/destory.jsp';">Destory</button>
</body>
</html>
