<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="cn.edu.cumt.ec.entity.Dingdan"%>
<%@ page import="cn.edu.cumt.ec.dao.DingdanDaoJDBCImpl"%>
<%@ page import="java.util.ArrayList"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>订单详情</title>
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
  <%@include file="dj.jsp" %>
    <h1>订单详情</h1>
    <hr>
  
    <center>
    <table width="750" height="60" cellpadding="0" cellspacing="0" border="0">
      <tr>
        <td>
          
          <!-- 商品循环开始 -->
           <% 
               DingdanDaoJDBCImpl dingdandaojdbcimpl = new DingdanDaoJDBCImpl(); 
               ArrayList<Dingdan> list = dingdandaojdbcimpl.getAllDingdan();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<list.size();i++)
	               {
	                  Dingdan dingdan = list.get(i);
           %>   
          <div>
             <dl>
               <dt>
               	<dd>  订单编号：<%=dingdan.getId()%> </dd>
               	<dd>  商品：<%=dingdan.getName()%> </dd>
               	<dd>  收货人：<%=dingdan.getUsername()%> </dd>
               	<dd>  收货地址：<%=dingdan.getAddress()%> </dd>
               	<dd>  联系电话：<%=dingdan.getTel()%> </dd>
               	<dd>  订单状态：<%=dingdan.getZt()%> </dd>
               </dt>
      </dl>
          </div>
          <!-- 商品循环结束 -->
        
          <%
                   }
              } 
          %>
        </td>
      </tr>
    </table>
    </center>
  </body>
</html>
