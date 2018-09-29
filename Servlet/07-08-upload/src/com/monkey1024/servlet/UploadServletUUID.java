package com.monkey1024.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * 解决上传文件名冲突问题，使用uuid
 */
public class UploadServletUUID extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.判断表单是否支持文件上传。即：enctype="multipart/form-data"
        boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
        if (!isMultipartContent) {
            throw new RuntimeException("该请求不能完成文件上传");
        }
        //2.创建一个DiskFileItemfactory对象
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //3.创建一个ServletFileUpload对象，该对象是上传的核心组件
        ServletFileUpload sfu = new ServletFileUpload(factory);
        //4.解析request对象，并得到一个表单项的集合
        try {
            List<FileItem> fileItems = sfu.parseRequest(request);
            //5.遍历该集合
            for (FileItem item : fileItems) {

                if (item.isFormField()) {
                    // 普通表单项
                    String fieldname = item.getFieldName();// 字段名
                    String fieldvalue = item.getString("UTF-8");//字段值
                    System.out.println(fieldname + "=" + fieldvalue);
                } else {
                    //上传表单项
                    //获取文件名
                    String fileName = item.getName();
                    fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
                    //在文件名中添加UUID保证唯一性
                    fileName = UUID.randomUUID() + "_" + fileName;
                    //获取输入流
                    InputStream is = item.getInputStream();
                    //创建输出流
                    String path = this.getServletContext().getRealPath("/upload");
                    File file = new File(path,fileName);
                    FileOutputStream fos = new FileOutputStream(file);
                    //完成文件的复制
                    byte[] bytes = new byte[1024];
                    int len = -1;
                    while((len = is.read(bytes)) != -1){
                        fos.write(bytes, 0, len);
                    }
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
	}

}
