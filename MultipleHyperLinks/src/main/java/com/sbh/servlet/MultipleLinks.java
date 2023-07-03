package com.sbh.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultipleLinks extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String pval=req.getParameter("p2");
		Locale loc[]=Locale.getAvailableLocales();
		if(pval.equalsIgnoreCase("link1")) {
			pw.println("<h1>All Countries Are</h1>");
			
			for(Locale l:loc) {
			pw.println(l.getDisplayCountry()+",");
			}
		}
		
		else if(pval.equalsIgnoreCase("link2")) {
			
             pw.println("<h1>All Languages Are</h1>");
			
			for(Locale l:loc) {
			pw.println(l.getDisplayLanguage()+",");
			}
			
		}
		
		else {
			pw.println("<h1> System Date And Time Is :"+LocalDateTime.now()+"</h1>");
		}
		
		pw.println("<a href='links.html'>Home</a>");
		
		
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	  
	}
	
	

}
