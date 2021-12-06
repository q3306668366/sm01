<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/11/27
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form method="post" enctype="multipart/form-data"
          action="${pageContext.request.contextPath}/user/upload.do">
        上传头像：<input type="file" name="image"><br>
        <input type="submit" value="上传"/>
    </form>
</div>
<div>
    <form method="post" enctype="multipart/form-data"
          action="${pageContext.request.contextPath}/user/upload2">
        上传头像1：<input type="file" name="image"><br>
        上传头像2：<input type="file" name="image"><br>
        上传头像3：<input type="file" name="image"><br>
        <input type="submit" value="批量上传"/>
    </form>
</div>
<%--hello,${requestScope.username}!!!你今年${requestScope.age}岁了！--%>
hello,${sessionScope.user.username}!!!
你今年${sessionScope.user.age}岁了！
</body>
</html>
