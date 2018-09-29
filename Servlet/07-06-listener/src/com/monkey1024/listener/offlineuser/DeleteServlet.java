package com.monkey1024.listener.offlineuser;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 将用户在线踢出
 */
@WebServlet("/deleteUser")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        //获取浏览器提交的数据，即要被踢出的用户名
        String username = request.getParameter("username");
        HttpSession currentSession = request.getSession();
        ServletContext sc = currentSession.getServletContext();
        //从ServletContext获取map
        Map<String,HttpSession> map = (Map<String,HttpSession>)sc.getAttribute("map");

        //获取要删除用户的session
        HttpSession session = map.get(username);
        //将该用户的session失效并从map中删除
        if(session != null){
            session.invalidate();
            map.remove(username);
        }

        response.sendRedirect(request.getContextPath() + "/login_success.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
