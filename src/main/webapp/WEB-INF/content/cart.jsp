<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@ page import="cn.edu.cumt.ec.entity.Items,java.util.*"%>
<%@ page import="cn.edu.cumt.ec.entity.Cart"%>
<%@ page import="cn.edu.cumt.ec.dao.productList"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:useBean id="productList" class="cn.edu.cumt.ec.dao.productList" />
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>购物车</title>

<script type="text/javascript" src="dist/js/demo.js"></script>
<link rel="stylesheet" href="css/style3.css"/>
</head>
<body class="grey">
<div class="headerBar">
	<div class="topBar">
		<div class="comWidth">
			<div class="rightArea">
				欢迎！<a href="loginForm">[登录]</a><a href="register">[免费注册]</a>
			</div>
		</div>
	</div>
	<div class="logoBar">
		<div class="comWidth">
			
			<div class="shopCar fr">
				<span href="cart"  class="shopText fl">购物车</span>
				<span class="shopNum fl">0</span>
			</div>
		</div>
	</div>
	</div>
<div class="catbox">

    <center>
    <h1 >您的购物车清单</h1>
    </center>


	<table id="cartTable">
		<thead>
			<tr>
				<th><label><input class="check-all check" type="checkbox"/>&nbsp;全选</label></th>
				<th>商品</th>
				<th>单价</th>
				<th>数量</th>
				<th>小计</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
           <% 				

            			    productList Cartlist=new productList();
                            String username=(String)session.getAttribute("username");
				    		List<Cart> list=Cartlist.getCart(username);
							for(int i=0;i<list.size();i++){
							Cart cart=(Cart)list.get(i);
					%>
			<tr>
				<td class="checkbox"><input class="check-one check" 
				type="checkbox" name="goodsid" 
				style="margin-left:60px;margin-top:40px;" 
				value="<%=cart.getId() %>"/></td>
				<td class="items"><img src="images/<%=cart.getPicture()%>" 
				width="200" height="160" alt=""/><span><%=cart.getName() %></span></td>
				<td class="price"><%=cart.getPrice() %></td>
				<td class="count">
				<a  href="reduce?cid=<%=cart.getId()%>&name=<%=cart.getName() %>&price=<%=cart.getPrice() %>&picture=<%=cart.getPicture()%>&ID=<%=session.getAttribute("username") %>&totalprice=<%=cart.getPrice() %>&cart=<%=cart.getNum() %>"><span class="reduce">-</span></a>
				<input class="count-input" type="text" name="number<%=cart.getNum()%>" value="<%=cart.getNum() %>"/>
				<input name="username" type="hidden"	value="<%=cart.getUsername()%>"/>
                <a href="addcart?cid=<%=cart.getId()%>&name=<%=cart.getName() %>&price=<%=cart.getPrice() %>&picture=<%=cart.getPicture()%>&ID=<%=session.getAttribute("username") %>&totalprice=<%=cart.getPrice()%>"><span class="add">+</span></a></td>
				<td class="subtotal"><%=cart.getNum()%>*<%=cart.getPrice() %></td>
				<td class="operation"><a href="delete?cid=<%=cart.getId()%>"><span class="delete">删除</span></a></td>
			</tr>
            <%} %>

		</tbody>
	</table>
	
	<div class="foot" id="foot">
		<label class="fl select-all"><input type="checkbox" class="check-all check"/>&nbsp;全选</label>
		<div class="fr closing"><a href="order">结 算</a></div>
		<div class="fr total">合计：￥<span id="priceTotal">0.00</span></div>
		<div class="fr selected" id="selected">已选商品<span id="selectedTotal">0</span>件<span class="arrow up">︽</span><span class="arrow down">︾</span></div>
		<div class="selected-view">
			<div id="selectedViewList" class="clearfix">
				<div><img src="images/1.jpg"/><span>取消选择</span></div>
			</div>
			<span class="arrow">◆<span>◆</span></span>
		</div>
	</div>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			 <a href="index"><button class="btn btn-block disabled" type="button">返回继续购物</button></a>
		</div>
	</div>
</div>
</div>
</body>

</html>
