<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>register</title>

</head>
<body>
<%@include file="dj.jsp" %>
	
	<form action="Register"  method="post">
						<div>
						<h3 align="center"><span>用户注册</span></h3><br/>
						</div>
						<div align="center"><span>
						已有账号，在此<a href="loginForm">登录</a></span></div><br/>
						<div align="center">
							<span>用户名： </span>		
							<input type="text" value="" name="username" >						
						</div>
						<div align="center">
							<span>电  话： </span>		
							<input type="text" value="" name="tel">						
						</div>
						<div align="center">
							<span>密 码： </span>		
							<input type="text" value="" name="password">
						</div>
						<div align="center"><input type="submit" value="同意协议并注册" ></div>
						<div align="center"><span><a href="">《用户协议》</a></span>
						</div>
						</form>
						</body>
						</html>