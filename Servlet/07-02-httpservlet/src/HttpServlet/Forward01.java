package HttpServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 准啊发
 * Servlet implementation class Forward01
 */
public class Forward01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//获取请求参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		request.setAttribute("username", username);// 类似map形式 key-value
		
		request.setAttribute("password", password);
		
		//转发
		request.getRequestDispatcher("ForwardOther01").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
