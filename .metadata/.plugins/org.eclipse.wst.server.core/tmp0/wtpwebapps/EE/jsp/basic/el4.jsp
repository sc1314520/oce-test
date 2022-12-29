<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el 隱式對象</title>
</head>
<body>
	${ pageContext.request}<br>
	<!-- 在 jsp 頁面中動態獲取虛擬目錄 -->
	${ pageContext.request.contextPath }<br> <!-- /EE -->
</body>
</html>