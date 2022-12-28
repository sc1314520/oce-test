package cookie.rememberTime;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/remember")
public class remember extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		Cookie[] cs = req.getCookies();
		boolean flag = false;
		if(cs!=null && cs.length>0) {
			for(Cookie c :cs) {
				String name=c.getName();
				if("lastTime".equals(name)) {
					flag=true;
					
					String value =c.getValue();
					System.out.println("解碼前："+value);
					//URL解碼
					value=URLDecoder.decode(value, "utf-8");
					System.out.println("解碼後："+value);
					resp.getWriter().write("<h1>歡迎回來!! 上次訪問時間："+value+"</h1>");
					
					// 設置新的 cookie 
					Date date =new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
					String str = sdf.format(date);
					
					System.out.println("編碼前："+str);
					//URL編碼 --> 存取中文或特殊字符
					str = URLEncoder.encode(str,"utf-8");
					System.out.println("編碼後："+str);
					
					// 發送cookie
					c.setValue(str);
					c.setMaxAge(60*60*24*30);
					resp.addCookie(c);
					
					break;
				}
			}
		}
		if(cs==null||cs.length==0||flag==false) {
			Date date =new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
			String str = sdf.format(date);
		
			System.out.println("編碼前："+str);
			//URL編碼 --> 存取中文或特殊字符
			str = URLEncoder.encode(str,"utf-8");
			System.out.println("編碼後："+str);
			
			Cookie cookie =new Cookie("lastTime", str);
			cookie.setMaxAge(60*60*24*30);
			resp.addCookie(cookie);
			resp.getWriter().write("<h1>歡迎首次訪問!! 訪問時間："+str+"</h1>");
		}
	}

}
