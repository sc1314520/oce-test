<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  el表達式 -->
	${ 3>4 }
	
	<!--  忽略 el 表達式：在最上面 isElIgnored="true" 或如下 -->
	\${ 3>4 }
	
	<hr>
	<!-- el 運算符 -->
	<h3>算數運算符</h3>
	${3+4} <br>
	${3/4} <br>
	<%-- ${3 div 4} <br>  --%>
	${3 % 4} <br>
	${3 mod 4} <br>
	<h3>比較運算符</h3>
	${3 == 4} <br>
	<h3>邏輯運算符</h3>
	${3>4 && 3<4} <br>
	${3>4 and 3<4} <br>
	${3>4 or 3<4} <br>
	<h3>空運算符</h3>
	<%-- ${empty list} --%>
	<!--  判斷是否為null 或 長度是否為0 -->
	<%
		String str="abc";
		request.setAttribute("str", str);
		
		List list = new ArrayList();
		request.setAttribute("list", list);
		
	%>
	${ empty str } <!--  false  --> <br>
	${ not empty str } <!-- true --> <br>
	${ empty list} <!--  true -->
</body>
</html>