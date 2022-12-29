package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// @WebFilter("/*") // 全資源攔截
// @WebFilter("/user/*") // 攔截某目錄下的所有資源
@WebFilter("*.jsp") // 後綴名攔截
public class filter3 implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		System.out.println("filter3 訪問");
		
		
	}

}
