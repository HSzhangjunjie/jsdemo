<%--
  Created by IntelliJ IDEA.
  User: 帅傑
  Date: 2020/3/3
  Time: 23:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册系统</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/RegisterServlet" method="post">
    学号：<input type="text" name="num"/><br>
    姓名：<input type="text" name="name"/><br>
    年龄：<input type="text" name="age"/><br>
    成绩：<input type="text" name="score"/><br>
    密码：<input type="password" name="password"/><br>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
