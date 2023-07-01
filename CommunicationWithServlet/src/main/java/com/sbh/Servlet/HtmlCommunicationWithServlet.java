package com.sbh.Servlet;

import java.io.*;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HtmlCommunicationWithServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		
		pw.println("<h1 style='color:red;text-align:center'>"+ldt.toString()+"</h1>");
		
		if(hour<12)
			pw.println("<h1 style='color:orange;text-align:center'>Good Morning</h1>");
		else if(hour<16)
			pw.println("<h1 style='color:Red;text-align:center'>Good Afternoon</h1>");
		else
			pw.println("<h1 style='color:Green;text-align:center'>Good Night</h1>");
		
		pw.println("<br> <a href='http://localhost:3030/CommunicationWithServlet/communication.html'>home</a>");
		
		pw.close();
	}

}
