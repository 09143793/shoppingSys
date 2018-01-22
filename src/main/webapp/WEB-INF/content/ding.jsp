<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<!--导航-->
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
  <div class="navbar-header" id="logo">
     <a href="##" class="navbar-brand"><img src="image/首页/aidong.jpg" class="logo"/></a>
  </div>
  <ul class="nav navbar-nav">
      <li class="active"><a href="a">首页</a></li>
    <li><a href="C.action"  ></a></li>
    <li><a href="C.action"  ></a></li>
    <li><a href="C.action"  ></a></li>
    <li><a href="C.action"  ></a></li>
    <s:if test="#session.user_name!=null">
    <li>  
     	<a id="dLabel" data-target="#" href="http://example.com" data-toggle="dropdown" role="button" aria-haspopup="true" 				aria-expanded="false">
          <s:property value="#session.user_name"/>
          <span class="caret"></span>
        </a>
      
        <ul class="dropdown-menu" aria-labelledby="dLabel">
                  <li><a href="C_Password">修改密码</a></li>
                  <li><a href="UserCar_getCar.action" name="user_name" value="<s:property value="#session.user_name"/>">我的购物车</a></li>
                  <li><a href="Billing_getDingdan.action">我的订单</a></li>
                  <li><a href="Shoucang_getShoucang.action">我的收藏</a></li>
        </ul>
    </li>
    </s:if>
    </ul>	
</div>

<div class="row p_top1">
    	<div class="col-lg-2">
        </div>
	<div class="col-lg-8">
  <table class="table table-hover ">
    <thead>
      <tr>
        <th>订单号</th>
        <th>总价</th>
        <th>收件人</th>  
        <th>收件地址</th>  
        <th>电话</th>
        <th>订单状态</th> 
        <th>详情</th> 
        <th></th>
      </tr>
    </thead>
    <tbody>
    <s:iterator id="list" value="#request.Dd_List" > 
      <tr>
        <td><s:property value="#list.order_id"/></td>
        <td><s:property value="#list.total_amount"/></td>
        <td ><s:property value="#list.addressee"/></td>
        <td ><s:property value="#list.address"/></td>
        <td ><s:property value="#list.a_phon"/></td>
        <td ><s:property value="#list.zhuangtai"/></td>
        <form action="Billing_getDd_Xq.action" method="post">
        <input type="hidden" name="order_id" value="<s:property value="#list.order_id"/>">
        <td><button type="submit" class="btn btn-default">详情</button></td>
        </form>
        <s:if test="#list.zhuangtai=='已收货'|#list.zhuangtai=='确认收货'">
        <form action="Qr_Sh" method="post">
       <td><button type="submit" class="btn btn-default">确认收货</button></td>
        </form>
        </s:if>
      </tr> 
    </s:iterator>
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
