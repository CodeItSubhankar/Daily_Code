package com.sbh.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultipleSubmit extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		
		res.setContentType("text/html");
		
		String s1val=req.getParameter("s1");
		int val1=0,val2=0;
		
		
		if(!s1val.equalsIgnoreCase("link1") && !s1val.equalsIgnoreCase("link2")) {
			val1=Integer.parseInt(req.getParameter("value1"));
			val2=Integer.parseInt(req.getParameter("value2"));
		
			
			if(s1val.equalsIgnoreCase("add"))
				pw.println("<h2>Addition Of "+val1+" And "+val2+" Is : "+(val1+val2)+"<h1>");
			
			else if(s1val.equalsIgnoreCase("sub"))
				pw.println("<h2>Substraction Of "+val1+" And "+val2+" Is : "+(val1-val2)+"<h1>");
			
			else if(s1val.equalsIgnoreCase("mul"))
				pw.println("<h2>Multiplication Of "+val1+" And "+val2+" Is : "+(val1*val2)+"<h1>");
			
			else if(s1val.equalsIgnoreCase("div"))
				pw.println("<h2>Addition Of "+val1+" And "+val2+" Is : "+(float)(val1/val2)+"<h1>");
			}
		
		
		
		else if(s1val.equalsIgnoreCase("link1")) {
			pw.println("<h1>System Properties Are</h1>");
			pw.println("<br>"+System.getProperties());
		}
		else {
			pw.println("<h1>System Date And Time is : "+LocalDateTime.now()+"</h1>");
		}
			
		
		pw.println("<a href='submit.html'>Home</a>");
		
		pw.close();
		
		
		
		
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
		
	}
	

}
