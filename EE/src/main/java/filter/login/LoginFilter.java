package filter.login;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


//@WebFilter("/*")
public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 強制轉換
		HttpServletRequest req = (HttpServletRequest)request;
		// 獲取資源請求路徑
		String uri =req.getRequestURI();
		
		//判斷是否為登入相關路徑,注意排除掉 css/js/圖片/驗證碼等等資源
		if(uri.contains("/login.jsp")|| uri.contains("/loginServlet")|| uri.contains("/css/")|| uri.contains("/js/")|| uri.contains("/images/")|| uri.contains("/loginServlet")|| uri.contains("/checkCode/")) {
			//直接放行
			chain.doFilter(request, response);
		}
		else {
			// 判斷是否登入
			Object user = req.getSession().getAttribute("user");
			if(user!=null) {
				//登入
				chain.doFilter(request, response);
			}
			else {
				req.setAttribute("login_msg", "您尚未登入");
				req.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		}
		
	}

}
