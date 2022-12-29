<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>if 標籤</title>
</head>
<body>
	<!--  test="接收 boolean 表達式" -->
	<c:if test="true">
		<h1>我是真</h1>
	</c:if>
	<%
		List list =new ArrayList();
		list.add("aaaa");
		request.setAttribute("list", list);
		
		request.setAttribute("number", 3);
	%>
	<c:if test="${not empty list}">
		遍歷集合
	</c:if><br>
	<c:if test="${number mod 2 !=0 }">
		${number}為奇數
	</c:if>
	<c:if test="${number mod 2 ==0 }">
		${number}為偶數
	</c:if>
</body>
</html>