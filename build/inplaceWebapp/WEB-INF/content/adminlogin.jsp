<%@ page contentType="text/html; charset=utf-8" language="java"  import="java.util.*,java.net.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>登录页面</title>
<%!String value=""; %>
</head>
<body>
<%@include file="dj.jsp" %>
<%
Cookie[] cookies = request.getCookies();
if(cookies != null) {
	for(int i=0; i<cookies.length; i++) {
		Cookie cookie = cookies[i];
        String username = cookie.getName();
        if(username.equals("username")){
        	value=URLDecoder.decode(cookie.getValue(),"UTF-8");
        }
     }
 } 
%>
<form action="Adminlogin" method="post">
<table align="center"><br/>
<tr>
		<td><h3>管理员登录</h3></a><br/></td>
	</tr><br/>
	
	<tr>
		<td>用户名：<input type="text" name="adminname" value=""/><br/></td>
	</tr><br/>
	<tr>
		<td>密&nbsp;码：<input type="password"  name="password" value=""/> <br/> </td>
	</tr><br/>
		<tr align="center">
		<td><input type="submit" value="登录"/>&nbsp;</a></td>
		</tr>
</table>
</form>
</body>
</html>
