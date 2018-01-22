<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>修改密码</title>
</head>
<body>
<%@include file="dj.jsp"  %>
<form action="Alter" method="post">
<table align="center"><br/>
<tr>
		<td><h3>修改密码</h3></a><br/></td>
	</tr><br/>
	
	<tr>
		<td>用户名：<input type="text" name="username"/><br/></td>
	</tr><br/>
	<tr>
		<td>旧密码：<input type="text" name="oldpassword"/><br/></td>
	</tr><br/>
	<tr>
		<td>新密码：<input type="text" name="newpassword"/><br/></td>
	</tr><br/>
	<tr align="center">
		<td><input type="submit" value="保存"/></td>
	</tr>
</table>
</form>
</body>
</html>