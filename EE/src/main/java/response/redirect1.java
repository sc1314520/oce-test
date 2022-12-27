package response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/red1")
public class redirect1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("demo1");

//		// 設置狀態碼為302
//		resp.setStatus(302);
//		// 設置路徑
//		resp.setHeader("location", "/EE/response4");
		
		//OR
		// req.setAttribute("msg", "你好");
		// 須加虛擬目錄，且不可傳參。
		// resp.sendRedirect("/EE/response4");
		
		//OR ->動態獲取虛擬目錄
		String contextPath = req.getContextPath();
		resp.sendRedirect(contextPath+"/red2");
		
	}

}
