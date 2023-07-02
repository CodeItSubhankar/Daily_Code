package com.sbh.Servlet;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class VoterEligiblity extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		
		res.setContentType("text/html");
		
		String name=req.getParameter("pname");
		String addres=req.getParameter("padrs");
		String tage=req.getParameter("page");
		
		
		List<String> errList=new ArrayList();
		
		if(name==null || name.length()==0 || name.equalsIgnoreCase(""))
			errList.add("Person Should Not be Empty");
		
		if(addres==null || addres.length()==0 || addres.equalsIgnoreCase(""))
			errList.add("Person ADDRESS Should not be EMPTY");
		
		else if(addres.length()<10)
			errList.add("Adress Must be Greter than 10 Character");
		
		int age=0;
		
		if(tage==null || tage.length()==0 || tage.equalsIgnoreCase(""))
		    errList.add("Person Age Should not be Empty");
		    
		else{
			try {
				age=Integer.parseInt(tage);
				if(age<0 || age>125)
					errList.add("Person Age Should be In the Range Between 1 to 125");
				
			}catch(NumberFormatException nfe) {
				errList.add("Age Should be in Numeric Format");
			}
		}
		
		
		if(errList.size()>0) {
			
			for(String errMsg:errList) {
				pw.println("<li style='color:red;text-align:center'>"+errMsg+"</li>");
			}
			
			return;
		}
		
		
		
		
		
			
		
		
		
		
		if(age>18)
			pw.println("<h1 style='color:green;text-align:center'>Ms/Mr/Mrs  "+name+"You Are Eligible to Vote</h1>");
		
		else
			pw.println("<h1 style='color:red;text-align:center'>Ms/Mr/Mrs  "+name+"You Are Not Eligible to Vote</h1>");
		
		pw.println("<br><a href='http://localhost:3030/HtmlFormWithServlet/voter.html'><img src='home.webp' width='50' height='50'></a>");
		
		
	}
	
	

}
