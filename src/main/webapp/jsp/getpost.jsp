<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'demo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   GET/POST的访问方式<br>
    <h3>
    <a href="demo/one.html"> demo/one.html</a><br>
    <a href="demo/two.html"> demo/two.html</a><br>
    <a href="demo/three.html"> demo/three.html</a><br>
    </h3>
    

    
    
     案例二  GET/POST的访问方式<br>
    <h3>
    <a href="demo/one.html"> demo2/one.html</a><br>
    <a href="demo/two.html"> demo2/two.html</a><br>
    <a href="demo/three.html"> demo2/three.html</a><br>
    </h3>
        <form action="demo/two.html" method="post">
    	<button type="submit" >提交post</button>
    
    </form>
    
  </body>
</html>
