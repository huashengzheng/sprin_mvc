<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/15
  Time: 15:08
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
    <title>hello==springmvc</title>
</head>
<body>
<a hre href="hello.do">第一个springmvc请求</a><br>


<a hre href="one.do">点击one</a><br>
<a hre href="two.do">post请求(无效)</a><br>
<form action="two.do" method="post"><button type="submit" name="post提交">post提交</button></form>
<a href="three.do">点击three</a><br>

<h1>测试1</h1>

<a href="userinfo.jsp">测试</a>
<a href="userinfo1.jsp">测试1</a>


<h2> 案例组四 多种的跳转</h2>

<h3>

    <a href="action/demo01.do">多种的跳转方式1</a><br>
    <a href="action/demo02.do">多种的跳转方式2</a><br>
    <a href="action/demo03.do">多种的跳转方式3重定向到jsp目录下</a><br>
    <a href="action/demo04.do">多种的跳转方式4重定向index.jsp</a><br>
    <a href="action/demo05.do">多种的跳转方式action/demo05.do</a><br>
    <a href="jsp/demo06.jsp">多种的跳转方式06:打开了文件夹下的页面</a><br>
    <a href="action/demo07.do?userid=8888">demo07多种的跳转方式</a><br>
    <a href="action/demo08.do">demo08多种的跳转方式JSON</a><br>
    <a href="action/demo09.do">demo09多种的跳转方式JSON string</a><br>
    <a href="action/gg.do">demo09多种的跳转方式JSON string</a><br>


</h3>


<h2>  rest跳转</h2>
<h3>
    <a href="rest/xinghai/show001.do">zshow001</a>
    <a href="rest/huasheng/xing/show002.do">zshow002</a>
    <a href="rest/xinjue/jiayi/show003/lixing.do">zshow003</a>
    <a href="rest/aaaa/bbb/lixing/rest04.do">rest04</a>
    <a href="rest/1007/35080119xxxxxx001/username_admin/rest04.do">rest04</a>



    <h2> 案例组四 文件上传</h2>
    <a href="uploadfile.jsp">uploadfile</a>

   <h2> 案例组6</h2>
   <a href="jsp/datetime.jsp">时间</a>${sessionScope.username},${sessionScope.date}


   <h2> 案例组5</h2>
    <a href="jsp/json.jsp">JQ查询返回用户列表</a>

<h2> 业务层操作</h2>
    <a href="userinfo/list.do">查询用户</a>${search}
    <a href="userinfo.jsp">注册用户</a>

</body>
</html>
