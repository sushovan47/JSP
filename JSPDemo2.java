package com.sushovan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JSPDemo2")
public class JSPDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("I am implementing JSP file"+"<br/>");
		
		String s1=request.getParameter("username");
		String s2=request.getParameter("password");
		
		//pw.println("User Name:"+s1+"<br/>");
		//pw.println("Password:"+s2+"<br/>");
		
		if(s1.equals("sushovan47")&&s2.equals("12345"))
		{
			RequestDispatcher disp=request.getRequestDispatcher("/success.jsp");
			disp.forward(request, response);	
		}
		else
		{
			RequestDispatcher disp1=request.getRequestDispatcher("/failure.jsp");
			disp1.forward(request, response);
		}
		
	}

}
