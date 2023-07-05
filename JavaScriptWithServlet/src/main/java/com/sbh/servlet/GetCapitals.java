package com.sbh.servlet;

import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class GetCapitals extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		int country=Integer.parseInt(req.getParameter("country"));
		
		String countries[]=new String[] {"India","china","Pakistan","USA"};
		String capitals[]=new String[] {"Delhi","Beijing","Islamabad","Wasington DC"};
		
		pw.println("<h1 style='color:green;text-align:center'>Capital Name of the Country  "+countries[country]+"  is  "+capitals[country]+"</h1>");
		
		
		pw.println("<a href='FirstPage.html'>Home</a>");
		pw.close();
		
		
		
		
		
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		doGet(req,res);
	}
	

}
