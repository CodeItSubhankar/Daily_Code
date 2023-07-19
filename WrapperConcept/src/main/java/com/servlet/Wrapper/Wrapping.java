package com.servlet.Wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class Wrapping extends HttpServletRequestWrapper {
 
	private HttpServletRequest request;
	public Wrapping(HttpServletRequest request) {
		super(request);
		this.request=request;
	}
	
	public String getParameter(String name) {
		String paramVal=request.getParameter(name);
		if(name.equals("email")) {
			if(!paramVal.endsWith("@gmail.com")) 
				paramVal=paramVal+"@gmail.com";
			
		}
		return paramVal;
		
	}

}
