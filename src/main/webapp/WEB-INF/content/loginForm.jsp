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


<form action="Login" method="post">
<table align="center"><br/>
<tr>
		<td><h3>登录页面</h3></a><br/></td>
	</tr><br/>
	<tr>
		<td><h5>没有账号，立即<a href="registerForm">注册</h5></a><br/></td>
	</tr><br/>
	<tr>
		<td>用户名：<input type="text" name="username" value="${cookie.username.value}"/><br/></td>
	</tr><br/>
	<tr>
		<td>密&nbsp;码：<input type="password"  name="password" value="${cookie.password.value }"/> <br/> </td>
	</tr><br/>
		<tr align="center">
		<td><input type="submit" value="登录"/>&nbsp;<a href="alter"><input type="button" value="修改密码" /></a>&nbsp;<a href="forget"><input type="button" value="找回密码"></a></td>
		</tr>
	<tr aligin="center">
	<td><input type="checkbox"  name="isUseCookie"  checked="">记住密码</p></td>
	</tr>
</table>
</form>
</body>
</html>
