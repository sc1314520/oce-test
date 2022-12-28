<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style type="text/css">
	div{
		color:red;
	}
</style>
</head>
<body>
	<form action="/EE/loginServlet" method="POST">
		<table>
			<tr>
				<td>用戶名</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>密碼</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>驗證碼</td>
				<td><input type="text" name="checkCode"></td>
			</tr>
			<tr>
				<td colspan="2"><img id="img" alt="" src="/EE/verifyCode"></td>
			<tr>
			<tr>
				<td colspan="2"><input type="submit" value="登入"></td>
			</tr>
		
		</table>
	</form>
	
	<div><%= request.getAttribute("cc_error") == null ? "":request.getAttribute("cc_error")%></div>
	<div><%= request.getAttribute("login_error") == null?"":request.getAttribute("login_error")%></div>
</body>
	<script type="text/javascript">
	window.onload=function(){
		var img = document.getElementById("img");
		// 點擊圖片更新
		img.onclick=function(){
			// 永不重複
			img.src="/EE/verifyCode?"+new Date().getTime();
		}
		
	}
</script>
</html>
