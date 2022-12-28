<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>成功頁面</title>
</head>
<body>
	<h1><%= request.getSession().getAttribute("user") %> 歡迎您</h1>
</body>
</html>