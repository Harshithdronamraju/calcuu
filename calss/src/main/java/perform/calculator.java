package perform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calculator")
public class calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	    throws ServletException, IOException {
	  response.setContentType("text/html");
	  PrintWriter out=null;
	 try{
	   out=response.getWriter();
	   out.println("<center>");
	   int a=Integer.parseInt(request.getParameter("t1"));
	   int b=Integer.parseInt(request.getParameter("t2"));
	   int c=0;
	   String op=request.getParameter("btn");
	   if(op.equals("+"))c=a+b;
	   if(op.equals("-"))c=a-b;
	   if(op.equals("*"))c=a*b;
	   if(op.equals("/"))c=a/b;
	   out.println("<h3>"+a+op+b+" = "+c+"</h3>");
	   
	   
	  
	  }catch(Exception e){
	   out.println("Error:"+e.getMessage());	
		}
		finally{
		  out.println("<br>");
		  out.println("To Goto main page <a href=index.html> Click HERE</a>");
		  out.println("</center>");
		}
		    
		}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
