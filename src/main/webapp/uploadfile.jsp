
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <title>My JSP 'upload.jsp' starting page</title>
    <meta charset="utf-8"/>
</head>
<body>
<a href="index.jsp">index</a>
<h3>文件上传表单1</h3>

<%--
加<%=basePath%>的作用：可以联系上传图片
--%>
<form  action="<%=basePath%>f/file.do" method="post" enctype="multipart/form-data" >
    file:<input type="file" name="file" id="file" value="C:\Users\Administrator\Desktop\20190319104646.png">
    <button type="submit">提交上传</button>
</form>


</body>
</html>
</body>
</html>
