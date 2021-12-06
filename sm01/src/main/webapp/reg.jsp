<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/11/29
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/param2/reg" method="post">
    用户名：<input name="username"><br>
    密码：<input name="pwd"><br>
    年龄：<input name="age"><br>
   <%-- 生日：<input name="birthday"><br>
    地址：<input name="address.city"><br>
    电话：<input name="address.phone"><br>--%>
    <input type="submit" value="reg">
</form>
</body>
</html>
