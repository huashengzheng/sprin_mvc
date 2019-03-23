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
${userInfo.toString()}
<form method="post"  action="ui/reg.do">
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

<form method="post"  action="ui/regop.do">
    <table border="2">
        <tr>
            <td>userId</td>
            <td><input name="userid" value="002"></td>

        </tr>
        <tr><td>userName</td>
            <td><input name="username" value="lisi"></td>

        </tr>
        <tr><td>userPass</td>
            <td><input name="userpass" value="123123"></td>

        </tr>
        <tr><td>userPhone</td>
            <td><input name="userphone" value="110"></td>

        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>



//注册

<form method="post"  action="userinfo/reg.do">
    <table border="1">
        <tr>
            <td>userId</td>
            <td><input name="userId" value="001"></td>

        </tr>
        <tr><td>userName</td>
            <td><input name="userName" value="zhangsan"></td>

        </tr>
        <tr><td>userPass</td>
            <td><input name="userPass" value="123123"></td>

        </tr>
        <tr><td>userPhone</td>
            <td><input name="userPhone" value="120"></td>

        </tr>
        <tr>
            <td>userState</td>
            <td>
            <select>
            <option  name="userState" value="0">0</option>
            <option name="userState" value="1">1</option>
        </select>
            </td>

        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>



</body>
</html>
