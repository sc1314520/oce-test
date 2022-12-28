package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// Cookie 快速入門
@WebServlet("/cookie3")
public class cookie3 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 創建多個Cookie
		Cookie c=new Cookie("msg","hello");
		Cookie c2=new Cookie("name","xinyu");
		// 發送多個Cookie
		resp.addCookie(c);
		resp.addCookie(c2);
	}

}
