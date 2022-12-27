package response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/response2")
public class response2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");// 設置輸出流編碼，要寫在輸出流前面 -> 不然中文會亂碼。(不過下方代碼可以取代此行）
		
		// 告訴瀏覽器編碼 
		resp.setHeader("content-type","text/html;charset=utf-8");
		// OR
		resp.setContentType("text/html;charset=utf-8"); 
		
		PrintWriter pw =resp.getWriter();
		pw.write("<h1>hello response</h1>");
		pw.write("你好"); 
	}
}
