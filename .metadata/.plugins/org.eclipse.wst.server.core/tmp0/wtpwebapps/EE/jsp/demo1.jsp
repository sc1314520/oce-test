<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<!-- 定義成員變量、方法。(作用範圍大) -->
	<%!
		int i=3;
	%>
	
	<!-- 定義 Java 代碼，Service有什麼，就可以定義什麼。 -->
	<% 
		System.out.println("hello jsp");
	
		// 內置對象
		String contextPath =request.getContextPath();
		out.write(contextPath);
	%>
	<% 
		// 優先於 out 輸出
		response.getWriter().write("response"); 
	%>
	
	<!-- 輸出至頁面 -->
	<%= i %>
	
	
</body>
</html>