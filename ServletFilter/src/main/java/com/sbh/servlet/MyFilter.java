package com.sbh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


//@WebFilter("/*")
public class MyFilter implements Filter {
	
	

	

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fchain)
			throws IOException, ServletException {
		PrintWriter pw=res.getWriter();
		
		
		
		//System.out.println("before filtering");
		String user=req.getParameter("uName");
		
		
		String pass=req.getParameter("pwd");
		
		if(user.equalsIgnoreCase("admin@gmail.com") && pass.equalsIgnoreCase("admin"))
		
		fchain.doFilter(req, res);
		
		else
			pw.println("Invalid Crendentials");
			
		//System.out.println("After filtering");
	}

	
	

}
