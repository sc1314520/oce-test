package listener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class demo1 implements ServletContextListener{

	// 服務器關閉後自動調用
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("銷毀");
	}

	
	// 服務器啟動後自動調用
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("創建");
		
		ServletContext servletContext =sce.getServletContext();
		String realPath = servletContext.getRealPath("/WEB-INF/classes/sensitive.txt");
		try {
			FileInputStream fis =new FileInputStream(realPath);
			System.out.println(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
