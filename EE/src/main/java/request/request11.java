package request;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request11")
public class request11 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ServletContext servletContext = req.getServletContext();
//		System.out.println(servletContext);
		
		ServletContext context =this.getServletContext();
		
		//獲取文件的服務器路徑
		String realPath =context.getRealPath("/test.txt");
		System.out.println(realPath); // /Users/blc0000421gmail.com/Desktop/oce-test/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/EE/test.txt
			
	}

}
