<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>订单管理</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>

   
<div class="row p_top2">
    <div class="col-lg-2">
    </div>
	<div class="col-lg-8">
  <table class="table table-hover ">
    <thead>
      <tr>
      	<th>订单号</th>
        <th>地址</th>
        <th>收件人</th>
        <th>收件人电话</th>
        <th>总价</th>
        <th>所属用户</th>
        <th>状态</th>
        <th></th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    <s:iterator id="list" value="#request.Order_List" > <!-- 遍历数据栈的任何数组，集合等 -->
      <tr>
        <td ><s:property value="#list.order_id"/></td>
        <td ><s:property value="#list.address"/></td>
        <td ><s:property value="#list.addressee"/></td>
        <td><s:property value="#list.a_phon"/></td>
        <td><s:property value="#list.total_amount"/></td>
        <td><s:property value="#list.user_name"/></td>
		<form action="getDdXiangqing">
			<input type="hidden" name="order_id" value="<s:property value="#list.order_id"/>">
		<td><button type="submit" class="btn btn-default">详情</button></td>
		</form>
       <form action="C_zhuangtai" method="post">          
         <td><input type="text" name="zhuangtai" value="<s:property value="#list.zhuangtai"/>"></td>       
         <input type="hidden" name="order_id" value="<s:property value="#list.order_id"/>">
        <td><button type="submit" class="btn btn-default">修改状态</button></td>
        </form>
      </tr> 
    </s:iterator>
		<tr></tr>
    </tbody>
  </table>
</div>
     <div class="col-lg-2">
     </div>
</div>


<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</body>
</html>
