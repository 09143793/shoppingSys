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
    <title>商品展示</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my items show">
	<!--
	<link rel="stylesheet" type="text/css" href="styles2.css">
	-->
	<style type="text/css">
	   div{
	      float:left;
	      margin: 10px;
	   }
	   div dd{
	      margin:0px;
	      font-size:10pt;
	   }
	   div dd.dd_name
	   {
	      color:blue;
	   }
	   div dd.dd_city
	   {
	      color:#000;
	   }
	</style>
</head>
<body>
<h1>商品管理</h1>
<h2>删除商品</h2>
<a href="houtai">添加商品</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="alterItem">修改商品</a>


	 <form action="shanchu" method="post">
	 输入商品id：
	 <input type="text" name="id"/>
	 <input type="submit" value="删除"/>
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