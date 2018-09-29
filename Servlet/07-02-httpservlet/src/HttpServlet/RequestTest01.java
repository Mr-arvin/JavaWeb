package HttpServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用HttpServletRequest接手请求数据 
 * Servlet implementation class RequestTest01
 */
public class RequestTest01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String[] hobby = request.getParameterValues("hobby");
		System.out.println(username);
		System.out.println(password);
		for(int i=0; i<hobby.length;i++) {
			System.out.println(hobby[i]);
		}
		
		String ip =request.getRemoteAddr();
		System.out.println(ip);
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
