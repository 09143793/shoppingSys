<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="cn.edu.cumt.ec.entity.Items"%>
<%@ page import="cn.edu.cumt.ec.dao.ItemsDAO"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>后台管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="keywords" content="jquery,ui,easy,easyui,web">
	<meta name="description" content="easyui help you build your web page easily!">
	<title>jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="http://www.w3cschool.cc/try/jeasyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="http://www.w3cschool.cc/try/jeasyui/themes/icon.css">
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="http://www.w3cschool.cc/try/jeasyui/jquery.easyui.min.js"></script>
</head>
<body>
<h1>商品管理</h1>
<h2>添加商品</h2>
<a href="adminD">删除商品</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="alterItem">修改商品</a>
<form action="addItem" method="get">
	<table id="tt"  style="width:1200px;height:250px"
			title="后台管理" 
			toolbar="#tb">
		<thead>
			<tr>
				<th  width="80">商品编号</th>
				<th  width="80">商品名称</th>
				<th width="80" align="right">商品分类</th>
				<th  width="80" align="right">价格</th>
				<th  width="150">数量</th>
				<th  width="60" align="center">图片</th>
			</tr>
			<tr>
				<td  width="80">
				<input class="easyui-textbox" name="id" data-options="prompt:'请注意商品ID为主键不可重复！'" style="width:100%;height:35px">
				</td>
				<td  width="80">
				<input class="easyui-textbox" name="name" style="width:100%;height:35px">
				</td>
				<td  width="80" align="right">
				<input class="easyui-textbox" name="categoryID" style="width:100%;height:35px">
				</td>
				<td  width="80" align="right">
				<input class="easyui-textbox" name="price" style="width:100%;height:35px">
				</td>
				<td  width="150">
				<input class="easyui-textbox" name="number" style="width:100%;height:35px">
				</td>
				<td  width="60" align="center">
				<input class="easyui-textbox"  name="picture" style="width:100%;height:35px">
				</td>
			</tr>
			
		</thead>
	</table>
	<div id="tb">
	<input type="submit" value="添加">
	</div>
	</form>
	 
          <!-- 商品循环开始 -->
          <%  
              
               ItemsDAO itemsDao = new ItemsDAO(); 
               ArrayList<Items> list = itemsDao.getAllItems();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<list.size();i++)
	               {
	                  Items item = list.get(i);
           %>   
          <div>
             <dl>
               <dt>
                 <a href="details?id=<%=item.getId()%>"><img src="images/<%=item.getPicture()%>" width="100" height="100" border="1"/></a>
               </dt>
               <dd class="dd_name"><%=item.getName() %>
               <dd class="dd_city">产地:<%=item.getCategoryID() %>&nbsp;&nbsp;价格:￥ <%=item.getPrice() %></dd> 
                <dd class="dd_city">库存:<%=item.getNumber() %>&nbsp;&nbsp;商品ID: <%=item.getId() %></dd> 
                 <dd class="dd_city">类别ID:<%=item.getCategoryID() %></dd>   
             </dl>
          </div>
          <!-- 商品循环结束 -->
        
          <%
                   }
              } 
          %>
</body>
</html>