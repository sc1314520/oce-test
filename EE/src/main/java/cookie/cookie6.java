package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// Cookie 設置共享範圍 --> 默認值 /EE
@WebServlet("/cookie6")
public class cookie6 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie c=new Cookie("msg","你好！！");
		
		// 設置 Path 讓當前服務器的所有項目共享 Cookie
		c.setPath("/");
		
		// 不同服務器間 Cookie 共享
		c.setDomain(".google.com");
		
		resp.addCookie(c);
		
	}

}
