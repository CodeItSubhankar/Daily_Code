package com.sub.servlet;

import javax.servlet.*;
//import javax.servlet.http.*;
import java.io.*;


public class Check extends GenericServlet{

public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{

 res.setContentType("text/html");

 PrintWriter pw=res.getWriter();
// res.setHeader("refresh","1");

     pw.println("<table border='1'align='center'>");
     pw.println("<tr><th>Player Name</th> <th>Medal</th> <th>Category</th> </tr>");
     pw.println("<tr><td>Neraj</td> <td>Gold</td> <td>Javeline</td> </tr>");
     pw.println("<tr><td>Mira Bai</td> <td>Silver</td> <td>Wrestling</td> </tr>");
     pw.println("</table>");

     pw.println("<br> <h1>Date And Time is:  "+new java.util.Date()+"</h1>");

     pw.close();




}


} 

