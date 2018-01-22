<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>密码找回</title>
</head>
<body>
<%@include file="dj.jsp"  %>
<form action="Forget" method="post">
<table align="center"><br/>
<tr>
		<td><h3>找回密码</h3></a><br/></td>
	</tr><br/>
	
	<tr>
		<td>用户名：<input type="text" name="username"/><br/></td>
	</tr><br/>
	<tr>
		<td>电&nbsp话：<input type="text" name="tel"/><br/></td>
	</tr><br/>
	<tr align="center">
		<td><input type="submit" value="确认"/></td>
	</tr>
</table>
</form>
</body>
</html>