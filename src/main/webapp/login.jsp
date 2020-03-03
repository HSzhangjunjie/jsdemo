<%--
  Created by IntelliJ IDEA.
  User: 帅傑
  Date: 2020/2/23
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登录信息门户</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/LoginServlet" method="post">
    学号：<input type="text" name="num"/><br>
    密码：<input type="password" name="password"/><br>
    <input type="submit" value="登录">${message}<br>
    <a href="${pageContext.request.contextPath}/ToRegisterServlet">注册</a>
</form>
</body>
</html>
