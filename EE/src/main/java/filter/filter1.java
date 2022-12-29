package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// 過濾器快速入門
@WebFilter("/jsp/filter/index.jsp") // 訪問某路徑時，都會先執行此過濾器
public class filter1 implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter");
		// 放行
		chain.doFilter(request, response);
		
	}

}
