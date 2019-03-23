<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js">//外网jq

</script>

	<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$("#buttonsubmit").click(function() {
								//alert("111");
											$.ajax({
														type : "POST",
														url : "json/getuilist.do",
														async : true,
														data : {


															username : "终结者001",
															proid : "a123123"
														},
														dataType : "json",
														success : function(data) {
															//var dataObj = eval("(" + json + ")");//转换为json对象
														//alert(data);
														 	if (data != null) {
																$("select").html("");//通过标签选择器，得到select标签，适用于页面里只有一个select
																var options = "<option value=\"0\">请选择</option>";
																for ( var i = 0; i < data.length; i++) {
																 
																	options += "<option  value=\""+data[i].userid+"\" >"
																			+ data[i].username
																			+ "</option>";

																}
																$("select").html(options);

															}

														},
														error : function() {
															alert("失败");
														}

													});

										});

					});
</script>


</head>

<body>

	<input type="button" id="buttonsubmit" value="PrintWriter方式触发AJAX" />



	<select id="select">

	<option value="0">====请选择====</option>
	</select>

<a href="json/getui.do">访问用户</a>


</body>


</html>
