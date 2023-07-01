package com.sbh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/firstservletURL")
public class FirstServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		String brandName=req.getParameter("brand");
		String modelName=req.getParameter("model");
		String engine=req.getParameter("eType");
		
		Cookie ck1=new Cookie("brand",brandName);
		Cookie ck2=new Cookie("model",modelName);
		Cookie ck3=new Cookie("engine",engine);
		
		res.addCookie(ck1);
		res.addCookie(ck2);
		res.addCookie(ck3);
		
		
		
		
		
		if(engine.equalsIgnoreCase("Petrol")) {
			pw.println("<h1 text-align='center' color='green'>GREAT CHOICE.....!!!!   WE ALSO LOVE PETROL ENGINE</h1>");
			pw.println("<form action='SecondServlet' method='post'");
			pw.println("<table background-color='#D6EEEE' align='center'>");
			pw.println("<tr><td>");
			pw.println("Petrol Tank Capacity: </td>");
			pw.println("<td><input type='number' name='val'>");
			
			pw.println("</td></tr>");
			
			pw.println("<tr><td><input type='submit' name='register'></td>");
			pw.println("<td><input type='reset' name='Cancel'></td></tr></table></form>");
		}
		else if(engine.equalsIgnoreCase("Diesel")) {
            pw.println("<h1 text-align='center' color='green'>GREAT CHOICE.....!!!! WE WOULD LOVE TO SHOW YOU YOUR DIESEL CAR</h1>");
            pw.println("<form action='SecondServlet' method='post'");
			pw.println("<table bgcolor='navyblue' align='center'>");
			pw.println("<tr><td>");
			pw.println("Diesel Tank Capacity: </td>");
			pw.println("<td><input type='number' name='val'>");
			pw.println("</td></tr>");
			pw.println("<tr><td><input type='submit' name='register'></td>");
			pw.println("<td><input type='reset' name='Cancel'></td></tr></table></form>");
			
			
		}
		else {
			
			 pw.println("<h1 text-align='center' color='green'>GREAT CHOICE.....!!!! Electric Cars Are  The Futures</h1>");
			 pw.println("<form action='SecondServlet' method='post'");
				pw.println("<table bgcolor='Green' align='center'>");
				pw.println("<tr><td>");
				pw.println("Battery Capacity: </td>");
				pw.println("<td><input type='number' name='val'>");
				pw.println("</td></tr>");
				pw.println("<tr><td><input type='submit' name='register'></td>");
				pw.println("<td><input type='reset' name='Cancel'></td></tr></table></form>");
				
			
		}
		
		
		
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	
	
	
	

}
