<%--
  Created by IntelliJ IDEA.
  User: 汪杰
  Date: 2021/11/5
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请登录</title>
</head>
<body>

    <form name="reg" action="/shopping/login" method="post">
        用户名: <input name="username" type="text" /><br/>
        密&nbsp;&nbsp;码：<input name="password" type="password" /><br/>

                <input type="submit" value="登录" id="bt" />
        </form>

</body>
</html>
