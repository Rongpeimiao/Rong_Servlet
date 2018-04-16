package com.rong.dome;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;  
  
import javax.servlet.ServletException;  
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 

@WebServlet("/DownLoadServlet")
public class DownLoadServlet extends HttpServlet {  

	 /**
	 * 
	 */
	private static final long serialVersionUID = 3954920021168772690L;

	/**
	 * 
	 */

	public DownLoadServlet() {  
	        super();  
	    }  
	  
	  
	    public void destroy() {  
	        super.destroy(); // Just puts "destroy" string in log  
	        // Put your code here  
	    }  
	  
	  
	    public void doGet(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
	        doPost(request,response);  
	    }  
	  
	      
	    public void doPost(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
	        //String dt = request.getParameter("dt");//�õ�����  
	        String pathFile=null;
	    	pathFile="D:/�ļ���";
	        //��������  
	        //��ȡҪ���ص��ļ�  
	        File f = new File(pathFile);  
	        if(f.exists()){  
	            FileInputStream  fis = new FileInputStream(f);  
	            String filename=URLEncoder.encode(f.getName(),"utf-8"); //��������ļ������غ����������  
	            byte[] b = new byte[fis.available()];  
	            fis.read(b);  
	            response.setContentType("application/octet-stream");  
	            response.setCharacterEncoding("utf-8");  
	            response.setHeader("Content-Disposition","attachment; filename="+filename+"");
	            response.setHeader("Content-Length", f.length()+"");
	            //��ȡ��Ӧ�������������  
	            ServletOutputStream  out =response.getOutputStream();  
	            //���  
	            out.write(b);  

	            out.flush();  
	            out.close();  
	        }
	    }  
	  
	    /** 
	     * Initialization of the servlet. <br> 
	     * 
	     * @throws ServletException if an error occurs 
	     */  
	    public void init() throws ServletException {  
	        // Put your code here  
	    }  
}
