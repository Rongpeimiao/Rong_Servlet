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
		    	// ���ñ���Ϊutf-8  
		        request.setCharacterEncoding("utf-8");  
		        response.setCharacterEncoding("utf-8");  
		  
		        // ��ȡ�û���������  
		        String username = request.getParameter("username");  
	            String password = request.getParameter("password");
		        if(username!=null||!"".equals(username.trim())||password!=null||!"".equals(password.trim())){  
		        	if(username.equals("admin")&&password.equals("123")){
		        		 System.out.println("��¼�ɹ���");  
		                 request.getSession().setAttribute("username", username);  
		                 response.sendRedirect("index.html");  
		                 return;  
		        	}else{
		        		System.out.println("�û��������벻��ȷ��");  
		        		response.sendRedirect("login.jsp");  
		        	}
		        }else{
	        		System.out.println("�û��������벻��Ϊ�գ�");  
	        		response.sendRedirect("login.jsp");  
	        	}  
        }   
          
    } 
