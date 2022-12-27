package request;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 獲取請求體數據
@WebServlet("/request5")
public class request5 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 獲取字符輸入流
		BufferedReader br = req.getReader();
		String line =null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		// 獲取字節輸入流 --> 文件上傳
		// ServletInputStream getInputStream();
	}

}
