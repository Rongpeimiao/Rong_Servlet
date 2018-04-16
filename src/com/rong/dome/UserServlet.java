package com.rong.dome;
import java.io.IOException;  
  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {  
	  
    /**
	 * 
	 */
	private static final long serialVersionUID = -6336007535426865239L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
        doPost(request,response);  
    }  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
		    	// 设置编码为utf-8  
		        request.setCharacterEncoding("utf-8");  
		        response.setCharacterEncoding("utf-8");  
		  
		        // 获取用户名和密码  
		        String username = request.getParameter("username");  
	            String password = request.getParameter("password");
		        if(username!=null||!"".equals(username.trim())||password!=null||!"".equals(password.trim())){  
		        	if(username.equals("admin")&&password.equals("123")){
		        		 System.out.println("登录成功！");  
		                 request.getSession().setAttribute("username", username);  
		                 response.sendRedirect("index.html");  
		                 return;  
		        	}else{
		        		System.out.println("用户名或密码不正确！");  
		        		response.sendRedirect("login.jsp");  
		        	}
		        }else{
	        		System.out.println("用户名或密码不能为空！");  
	        		response.sendRedirect("login.jsp");  
	        	}  
        }   
          
    } 
