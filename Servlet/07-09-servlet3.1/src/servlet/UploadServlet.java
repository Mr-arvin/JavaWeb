package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet 3.1 实现文件上传 implementation class UploadServlet
 */
@WebServlet("/upload")
@MultipartConfig //表示当前servlet可以处理@Multipart请求，不写该注解处理不了的
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = this.getServletContext().getRealPath("/upload");
		//获取上传文件
		Part part = request.getPart("photo");
		//获取上传文件的名字，该方法是3.1版本中添加的
		String name = part.getSubmittedFileName();
		System.out.println(path+"|"+name);
		//将上传的文件写入到指定的服务器路径中
		part.write(path + "/" + name);
	}

	/** 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
