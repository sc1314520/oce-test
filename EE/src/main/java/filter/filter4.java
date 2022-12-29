package filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// REQUEST 默認值（直接請求） 、 FORWARD 轉發訪問資源 、 INCLUDE 包含訪問資源 、 ERROR 錯誤跳轉資源 、 ASYNC 異步訪問資源
//@WebFilter(value = "/jsp/filter/index4.jsp" , dispatcherTypes = DispatcherType.REQUEST) 
//@WebFilter(value = "/jsp/filter/index4.jsp" , dispatcherTypes = DispatcherType.FORWARD) 
@WebFilter(value = "/jsp/filter/index4.jsp" , dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST}) 
public class filter4 implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("filter4 訪問");
		
		
		
	}

}
