<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="el.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<User> list =new ArrayList<>();
		list.add(new User("路人一",20,new Date()));
		list.add(new User("路人二",20,new Date()));
		list.add(new User("路人三",18,new Date()));
		request.setAttribute("list", list);
	%>
	<table border="1" width="500" align="center">
		<tr>
			<th>編號</th>
			<th>姓名</th>
			<th>年齡</th>
			<th>儲存時間</th>
		</tr>
		<c:forEach items="${list}" var="user" varStatus="s">
			<c:if test="${s.count %2 ==0 }">
				<tr bgcolor="white">
					<td align="center">${s.count}</td>
					<td align="center">${user.name}</td>
					<td align="center">${user.age}</td>
					<td align="center">${user.birStr}</td>
				</tr>
			</c:if>
			<c:if test="${s.count %2 ==1 }">
				<tr bgcolor="gray">
					<td align="center">${s.count}</td>
					<td align="center">${user.name}</td>
					<td align="center">${user.age}</td>
					<td align="center">${user.birStr}</td>
				</tr>
			</c:if>
		</c:forEach>
	
	</table>
</body>
</html>