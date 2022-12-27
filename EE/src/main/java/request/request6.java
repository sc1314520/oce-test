package request;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 獲取請求方式的通用方法
@WebServlet("/request6")
public class request6 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 獲取參數前，設置編碼。
		req.setCharacterEncoding("utf-8");
		
		String username = req.getParameter("username");
		System.out.println("post");
		System.out.println(username);
		
		String[] hobbies =req.getParameterValues("hobby");
		for(String hobby:hobbies) {
			System.out.println(hobby);
		}
		
		Enumeration<String> parameterNames = req.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			String name = parameterNames.nextElement();
			System.out.println(name);
			String value = req.getParameter(name); // checkbox或複選選項只能獲取一個
			System.out.println(value);
			System.out.println("-------------");
		}
		
		Map<String,String[]> parameterMap =req.getParameterMap();
		Set<String> keys = parameterMap.keySet();
		for(String key:keys) {
			String[] values =parameterMap.get(key);
			System.out.println(key);
			for(String value:values) {
				System.out.println(value);
			}
			System.out.println("--------");
		}
	}

}
