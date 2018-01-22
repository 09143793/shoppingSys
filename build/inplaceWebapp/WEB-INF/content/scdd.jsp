<%@ page language="java" import="java.util.*"  contentType="text/html; charset=utf-8"%>
<%@ page import="cn.edu.cumt.ec.entity.Cart"%>
<%@ page import="cn.edu.cumt.ec.dao.CartDao"%>
<%@ page import="cn.edu.cumt.ec.dao.CartDaoJDBCImpl"%>
<%@ page import="java.util.ArrayList"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>生成订单</title>
</head>
<body>
<%@include file="dj.jsp" %>
<form action="SCDD" method="post">
<table align="center">
<tr>
		<td><h3>生成订单</h3></a><br/></td>
</tr>
<tr>
        <td>
          
          <!-- 商品循环开始 -->
           <% 
               CartDaoJDBCImpl cartDaojdbcimpl = new CartDaoJDBCImpl(); 
               ArrayList<Cart> list =cartDaojdbcimpl.getAllCart();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<list.size();i++)
	               {
	                  Cart cart = list.get(i);
           %>   
          <!-- 商品循环结束 -->
        
          <tr>
		<td><input type="hidden" name="name" value="<%=cart.getName()%>"/></td>
	</tr><br>
	 <tr>
		<td><input type="hidden" name="price" value="<%=cart.getCount()%>"/></td>
	</tr><br>
	 <%
                   }
              } 
          %>
        </td>
      </tr>
      <tr>
		<td>订单编号：<input type="text" name="id" value="<%=(int)(Math.random()*100000) %>"/></td>
	</tr><br>
	<tr>
		<td><input type="hidden" name="username" value="<%=session.getAttribute("username") %>"/></td>
	</tr><br>
	
	<tr>
		<td>收货&nbsp;人：<input type="text" name="shr"/></td>
	</tr><br/>
	<tr>
		<td>收货地址：<input type="text" name="address"/></td>
	</tr>
	<tr>
		<td>联系电话：<input type="text" name="tel"/></td>
	</tr><br/>
	<tr>
		<td><input type="hidden" name="zt" value="未发货"/></td>
	</tr><br/>
	
         
	
	
		<tr align="center">
		<td><input type="submit" value="提交"/></td>
		</tr>
</table>
</form>
</body>
</html>