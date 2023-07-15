package com.sbh.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

public class FileUploadServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		
			try {
			MultipartRequest m=new MultipartRequest(req,"E:\\FileUpload");
			pw.println("<h1 style='color:green;text-align:center'> File Uploaded Successfully<h1>");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		
		
		
		
		
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	 doGet(req, res);
	}
	

}
