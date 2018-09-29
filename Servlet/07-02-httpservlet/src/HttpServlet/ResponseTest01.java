package HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用HttpServletRequest接手请求数据 
 * Servlet implementation class RequestTest01
 */
public class ResponseTest01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String username = request.getParameter("username");
		//注意一定要在获取PrintWriter对象之前设置编码
		
		//设置字符编码为UTF-8
//1		response.setCharacterEncoding("UTF-8");
		//告诉浏览器以utf-8的方式解码		
//2 	    response.addHeader("Context-type","text/html;charset=UTF-8");
 	    
 	    response.setContentType("text/html;charset=UTF-8"); //这一行代码的作用顶上面1、2两行代码的作用，开发中建议使用这种方式
		
		PrintWriter out = response.getWriter();
		out.print("用户名："+username+"注册成功<br>");
		out.print("感谢注册!");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
