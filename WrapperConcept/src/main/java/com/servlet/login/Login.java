package com.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginurl") 
public class Login extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		String mail=req.getParameter("email");
		String pass=req.getParameter("pwd");
		
		if(mail.equalsIgnoreCase("admin@gmail.com") && pass.equalsIgnoreCase("admin")) 
			pw.println("<h1 style='color:green;text-align:center'>Valid Credentials</h1>");
		else
			pw.println("<h1 style='color:red;text-align:center'>Invalid Credentials</h1>");
		
		pw.close();
		
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	doGet(req, res);
	}
	
	

}
