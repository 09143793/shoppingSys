<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%@ page import="java.sql.*"%>  
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>我的店铺</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

  </head>
   <%  
    //装载MySQLJDBC驱动  
    Class.forName("com.mysql.jdbc.Driver").newInstance();  
    //建立数据库连接  
    String url ="jdbc:mysql://localhost:3306/wy?user=root&password=123456&useUnicode=true&characterEncoding=utf-8";  
    Connection conn= DriverManager.getConnection(url);  
    //建立一个Statement对象，用于执行SQL语句  
    Statement stat = conn.createStatement();  
    //执行查询并得到查询结果  
      String  name,price,desc,img;
      Integer id;
   		 
  %>     
  <body>
<%@include file="dj.jsp" %>
	<div class="row">
        <table  width="600">  
        <tr bgcolor="#dddddd">  
            <td align="center" width="80">商品缩图</td>   
            <td align="center">商品摘要</td>  
            <td align="center" width="100">在线购买</td>  
        </tr>  
       
		<div class="col-md-4">
                <%  
          String sql3 = "select * from product2";  
    ResultSet rs3 = stat.executeQuery(sql3);
              
            //将查询结果集中的记录输出到页面上  
            while (rs3.next()){  
                //从当前记录中读取各字段的值  
                img = rs3.getString("PIMG");  
                id = rs3.getInt("ID");  
                name = rs3.getString("PNAME");  
                price = rs3.getString("PRICE");  
                desc= rs3.getString("PDESC");  
                  
                out.println("<tr>");  
                out.println("<td><img src='"+ img +"' border=0 height=220 width=220></td>");  
                out.println("<td>");  
                out.println("商品编号："+ id +"<br>");  
                out.println("商品名称："+ name +"<br>");  
                out.println("商品价格："+ price +"元<br>");  
                out.println("商品简介："+ desc +"<br>");  
                out.println("</td>");  
                out.println("<td><a href='buy?sp=add&r1="+name+"&r2="+price+"&bm="+id+"'>放入购物车</a></td>");  
                out.println("</tr>");  
            }  
        %>         
		</div>
		<div class="col-md-4">
		</div>
	</div>
</div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>