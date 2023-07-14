package com.sbh.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;

public class FileDownloadServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		String fileName="FiledownloadTest.html";
		String filePath="E:\\";
		ServletContext sc=getServletContext();
		String mime=sc.getMimeType(filePath);
		mime=mime!=null?mime:"application/octet-stream";
		res.setHeader("Content-Disposition","attachment;filename=\""+fileName+"\"");
		
		InputStream is=new FileInputStream(filePath+fileName);
		
		is.close();
		pw.close();
	
		
		
		
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}
	
	

}
