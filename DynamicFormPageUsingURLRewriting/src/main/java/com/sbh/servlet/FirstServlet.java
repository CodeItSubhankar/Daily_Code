package com.sbh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/firstservletURL")
public class FirstServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		String brandName=req.getParameter("brand");
		String modelName=req.getParameter("model");
		String engine=req.getParameter("eType");
		
		
        HttpSession ses=req.getSession();
		
		ses.setAttribute("bname",brandName);
		ses.setAttribute("mname",modelName);
		ses.setAttribute("engine",engine);
		
		
		
		
		
		if(engine.equalsIgnoreCase("Petrol")) {
			pw.println("<h1 text-align='center' color='green'>GREAT CHOICE.....!!!!   WE ALSO LOVE PETROL ENGINE</h1>");
			pw.println("<form action="+res.encodeRedirectURL("SecondServlet")+" method='post'");
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
            pw.println("<form action="+res.encodeRedirectURL("SecondServlet")+" method='post'");
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
			 pw.println("<form action="+res.encodeRedirectURL("SecondServlet")+"method='post'");
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
