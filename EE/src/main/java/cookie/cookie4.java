package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// Cookie setMaxAge 設定存活時間
@WebServlet("/cookie4")
public class cookie4 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie c=new Cookie("msg","setMaxAge");
		
		// 設定存活時間 --> 正數：second  負數(默認值）:流覽器關閉及銷毀  0則為刪除Cookie
		c.setMaxAge(300); // 持久化 300 秒
		resp.addCookie(c);
		
	}

}