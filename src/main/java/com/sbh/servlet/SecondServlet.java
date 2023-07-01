package com.sbh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
//		
		
		Cookie[] cookies=req.getCookies();
		
        String capacity=req.getParameter("val");
		
		pw.println("<h2 style='color:#327ba8;text-align:center;'>You Have Choosen As Follows  </h2>");
		
		if(cookies!=null) {
			pw.println("<table border='1' align='center' bgcolor='cyan'");
			for(Cookie c:cookies) {
				pw.println("<tr><td>"+c.getName()+": "+c.getValue()+"</td></tr>");
			}
			pw.println("</table>");
			
			
			
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
