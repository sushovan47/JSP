package com.sushovan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HttpServletDemo2")
public class HttpServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.println("You Register to us Successfully........You can get Your Oficial Id and Password through Activation Link via Email & SMS"+"<br/>");
		String s1=request.getParameter("USERNAME");
		String se=request.getParameter("EMAIL");
		String mn=request.getParameter("MOBILE");
		String s2=request.getParameter("PASSWORD");
		String s3=request.getParameter("USERQUALIFICATION");
		String s4=request.getParameter("GENDER");
		String s5=request.getParameter("TECHNOLOGY");
		String s6=request.getParameter("COMMENTS");
		
		pw.println("User Name:"+s1+"<br/>");
		pw.println("E Mail :"+se+"<br/>");
		pw.println("Moblile No:"+mn+"<br/>");
		pw.println("Password:"+s2+"<br/>");
		pw.println("User Qualification:"+s3+"<br/>");
		pw.println("Gender:"+s4+"<br/>");
		pw.println("User Technology:"+s5+"<br/>");
		pw.println("Ccomments:"+s6+"<br/>");
		
	}

}
