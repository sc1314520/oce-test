package request;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request9")
public class request9 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ServletContext servletContext = req.getServletContext();
//		System.out.println(servletContext);
		
		ServletContext context =this.getServletContext();
		// 獲取 MIME 類型
		String filename ="a.jpg";
		String mineType=context.getMimeType(filename);
		System.out.println(mineType); // image/jpeg
		
		// 共享數據 <-- 先訪問 /request10 儲存在 ServletContext 的數據可以全域運用。
		Object msg=context.getAttribute("msg"); 
		System.out.println(msg);//hello
		
	}

}
