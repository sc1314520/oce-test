package request;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 獲取請求行數據
@WebServlet("/request1")
public class request1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String method = req.getMethod();
		System.out.println(method); //GET
		
		String contextPathString = req.getContextPath();
		System.out.println(contextPathString); ///EE
		
		String servletPath=req.getServletPath();
		System.out.println(servletPath);// /request1
		
		String queryString = req.getQueryString(); // 獲取參數
		System.out.println(queryString);// name=you
		
		String uri = req.getRequestURI();
		StringBuffer url =req.getRequestURL();
		System.out.println(uri); //  /EE/request1
		System.out.println(url); //  http://localhost:8080/EE/request1
		
		String protocol = req.getProtocol();
		System.out.println(protocol); // HTTP/1.1
		
		String IP = req.getRemoteAddr();
		System.out.println(IP); //  0:0:0:0:0:0:0:1
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
