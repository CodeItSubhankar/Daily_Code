package com.sbh.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WorkerSevlet extends HttpServlet {

	
	
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		String name=req.getParameter("name");
		String wID=req.getParameter("wid");
		String designation=req.getParameter("designation");
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		 try{
		        Class.forName("com.mysql.cj.jdbc.Driver");
		       Connection c=DriverManager.getConnection("jdbc:mysql:///worker", "root","subha1234");
		       PreparedStatement ps= c.prepareStatement("INSERT INTO worker VALUES(?,?,?)");
		       ps.setString(1,name);
		       ps.setString(2,wID);
		       ps.setString(3,designation);
		       
		       int i=ps.executeUpdate();
		       
		       if(i>0)
		    	   pw.print("<h1 style='color:green;text-align:center'>Record is inserted Successfully</h1>");
		       else
		    	   pw.print("<h1 style='color:red;text-align:center'>Record is insertion UNSUCCESSFUL</h1>");
		       
		       c.close();		       
		       
		       
		       
		       
		       
		    }
		        catch(Exception e){
		            e.printStackTrace();
		        }
		
		
		
		
		
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
	

}
