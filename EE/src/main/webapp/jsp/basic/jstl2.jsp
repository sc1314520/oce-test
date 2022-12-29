<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>choose 標籤</title>
</head>
<body>
	<%
		request.setAttribute("number", 3);
	%>
	<c:choose>
		<c:when test="${number ==1}">星期一</c:when>
		<c:when test="${number ==2}">星期二</c:when>
		<c:when test="${number ==3}">星期三</c:when>
		<c:when test="${number ==4}">星期四</c:when>
		<c:when test="${number ==5}">星期五</c:when>
		<c:when test="${number ==6}">星期六</c:when>
		<c:when test="${number ==7}">星期日</c:when>
		<c:otherwise>數字輸入錯誤</c:otherwise>
	</c:choose>
</body>
</html>