<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forEach 標籤</title>
</head>
<body>
	
	<%-- 
		begin 開始
		end 結束
		var 變量名
		step -> i+=?
		varStatus 循環狀態對象
			index 容器中元素的索引 從0開始
			count 循環次數 從1開始
	
	--%>
	<c:forEach begin="1" end="10" var="i" step="2" varStatus="s">
		${ i } ${s.index} ${s.count} <br>
	</c:forEach>
	
	<%
		List list =new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		request.setAttribute("list", list);
	%>
	<%-- 
		加強 for 循環
		items:容器
	--%>
	<c:forEach items="${list}" var="str" varStatus="s">
		${s.count} ${s.index} ${str} <br>
	</c:forEach>
	
</body>
</html>