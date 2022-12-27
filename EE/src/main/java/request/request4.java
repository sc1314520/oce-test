package request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 獲取請求頭數據
@WebServlet("/request4")
public class request4 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw =resp.getWriter();
		// 獲取 referer
		String referer =req.getHeader("referer");
		System.out.println(referer); // http://localhost:8080/EE/index.html
		// 防盜鏈
		if(referer!=null) {
			if(referer.contains("/EE")) {
				System.out.println("播放電影");
				pw.write("播放電影!!");
			}
			else {
				System.out.println("盜鏈!!");
				pw.write("盜鏈!!");
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
