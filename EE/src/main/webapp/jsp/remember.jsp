<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLDecoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie-Remember</title>
</head>
<body>
	<%
		Cookie[] cs = request.getCookies();
		boolean flag = false;
		if(cs!=null && cs.length>0) {
			for(Cookie c :cs) {
				String name=c.getName();
				if("lastTime".equals(name)) {
					flag=true;
					
					String value =c.getValue();
					System.out.println("解碼前："+value);
					//URL解碼
					value=URLDecoder.decode(value, "utf-8");
					System.out.println("解碼後："+value);
					out.write("<h1>歡迎回來!! 上次訪問時間："+value+"</h1>");
					
					// 設置新的 cookie 
					Date date =new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
					String str = sdf.format(date);
					
					System.out.println("編碼前："+str);
					//URL編碼 --> 存取中文或特殊字符
					str = URLEncoder.encode(str,"utf-8");
					System.out.println("編碼後："+str);
					
					// 發送cookie
					c.setValue(str);
					c.setMaxAge(60*60*24*30);
					response.addCookie(c);
					
					break;
				}
			}
		}
		if(cs==null||cs.length==0||flag==false) {
			Date date =new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
			String str = sdf.format(date);
		
			System.out.println("編碼前："+str);
			//URL編碼 --> 存取中文或特殊字符
			str = URLEncoder.encode(str,"utf-8");
			System.out.println("編碼後："+str);
			
			Cookie cookie =new Cookie("lastTime", str);
			cookie.setMaxAge(60*60*24*30);
			response.addCookie(cookie);
			out.write("<h1>歡迎首次訪問!! 訪問時間："+str+"</h1>");
		}
	%>

</body>
</html>