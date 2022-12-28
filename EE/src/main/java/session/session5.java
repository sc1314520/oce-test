package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/session5")
public class session5 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//獲取 Session --> 服務器關閉，瀏覽器不關閉，Session不同。
		HttpSession session = req.getSession();
		System.out.println(session);
		
		// Session 失效時間（默認為30分鐘)。
		session.setMaxInactiveInterval(60*30); // seconds <-- 負數或0 則永久不會失效。
		
		// Session 失效。
		session.invalidate();
		
	}

}
