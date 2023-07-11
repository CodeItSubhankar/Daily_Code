package com.sbh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		HttpSession ses=req.getSession(false);
		
		
		String brandName=(String)ses.getAttribute("bname");
		String modelName=(String)ses.getAttribute("mname");
		String engine=(String)ses.getAttribute("engine");
		
		
		
		
        String capacity=req.getParameter("val");
		
		pw.println("<h2 style='color:#327ba8;text-align:center;'>You Have Choosen As Follows  </h2>");
		
		
			pw.println("<table border='1' align='center' bgcolor='cyan'");
			
           pw.println("<tr><td>Brand Name:  </td><td>"+brandName+"</td></tr><tr><td>Model Name:  </td><td>"
           +modelName+"</td></tr><tr><td>Engine Type:  </td><td>"+engine+"</td></tr><tr><td>Tank Capacity:  </td><td>"
		    +capacity+"</td></tr>");
			
			pw.println("</table>");
			
			
			
		}

		
		
		
	

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
