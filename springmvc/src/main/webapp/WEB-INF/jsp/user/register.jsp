<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户注册</title>
</head>
<body>

	<form method ="post" action="<c:url value="/user.html"/>">
		<table>
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="userName"/></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td>姓名:</td>
				<td><input type="text" name="realName"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="提交"/></td>
			</tr>
		</table>
	</form>
	
</body>
</html>