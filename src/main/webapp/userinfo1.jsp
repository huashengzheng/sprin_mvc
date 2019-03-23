<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/18
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();

    String basePath = request.getScheme() + "://" + request.getServerName() + ":"

            + request.getServerPort() + path + "/";

%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
<form method="post"  action="lombox/regop.do">
    <table border="1">
        <tr>
            <td>userId</td>
            <td><input name="userid" value="001"></td>

        </tr>
        <tr><td>userName</td>
            <td><input name="username" value="zhangsan"></td>

        </tr>
        <tr><td>userPass</td>
            <td><input name="userpass" value="123123"></td>

        </tr>
        <tr><td>userPhone</td>
            <td><input name="userphone" value="120"></td>

        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>


</body>
</html>
