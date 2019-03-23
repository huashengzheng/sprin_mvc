<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">



	<script language="javascript" type="text/javascript" src="http://www.my97.net/My97DatePicker/WdatePicker.js"></script>




  </head>
  
  <body>

 
   <form action="get/date.do" method="post">
   
  <input  name="date" type="text" onClick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd HH:mm:ss'})"> <font color=red>&lt;- 点我弹出日期控件</font>


       <input id="d11" type="text" onClick="WdatePicker()"/>

       <input type="text" class="Wdate" id="d122" onclick="WdatePicker({isShowWeek:true,onpicked:function() {$dp.$('d122_1').value=$dp.cal.getP('W','W');$dp.$('d122_2').value=$dp.cal.getP('W','WW');}})"/>

       <input class="Wdate" type="text" id="d15" onclick="WdatePicker({isShowClear:false,readOnly:true})"/>
   <!-- my97 -->
   <button type="submit" >提交时间 </button>
   </form>
   
  </body>
</html>
