package com.monkey1024.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 文件下载
 */
public class DownloadServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//解决乱码问题
		String fileName = "小猴子1024.png";
		fileName = new String(fileName.getBytes("UTF-8"),"iso8859-1");
		//设置响应头属性，使文件以附件的形式下载
		response.setHeader("content-disposition", "attachement;filename="+fileName);
		//获取文件的输入流
		InputStream is = this.getServletContext().getResourceAsStream("/download/哈哈哈monkey1024.gif");
		//输出流
		ServletOutputStream os = response.getOutputStream();
		//复制文件
		byte[] bytes = new byte[1024];
		int len = 1;
		while((len = is.read(bytes)) != -1) {
			os.write(bytes,0,len);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
