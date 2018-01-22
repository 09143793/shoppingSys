<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>订单评论</title>
<meta name="description"
			content="星级评论打分系统" />
</head>
<body>
<%@include file="dj.jsp" %>
<form action="Fankui" method="post">
<div>
<span>物流&nbsp&nbsp</span>
<select>
<option value="1">非常满意</option>
<option value="2">满意</option>
<option value="3">一般</option>
<option value="4">不满意</option>
<option value="5">很不满意</option>
</select><br/>
<span>质量&nbsp&nbsp</span>
<select>
<option value="1">非常满意</option>
<option value="2">满意</option>
<option value="3">一般</option>
<option value="4">不满意</option>
<option value="5">很不满意</option>
</select><br/>
<span>服务&nbsp&nbsp</span>
<select>
<option value="1">非常满意</option>
<option value="2">满意</option>
<option value="3">一般</option>
<option value="4">不满意</option>
<option value="5">很不满意</option>
</select><br/>
<input type="submit" value="提交"/>
</div>

</form>
</body>
</html>