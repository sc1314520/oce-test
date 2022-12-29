<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>獲取值</h3>
	<%-- 
		${域名稱.鍵名} 
			pageScope	--> pageContext
			requestScope --> request
			sessionScope --> session
			applicationScope --> ServletContext
	--%>
	<%
		request.setAttribute("name", "xing");
		session.setAttribute("name", "yu");
		session.setAttribute("age", "23");
	%>
	${ requestScope.name } <br>
	${ sessionScope.age } <br>
	${ sessionScope.ha } <br> <!-- 返回空字串 -->
	
	<h3>第二寫法</h3>
	<!-- 第二寫法 從最小的域開始找，直到找到第一個為止 -->
	${ name } <!-- xing --> <br>
	${ age }
</body>
</html>