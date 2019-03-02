package com.sushovan;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JSPDemo1")
public class JSPDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("I am Implementing JSP file"+"<br/>");
		
		String uname=request.getParameter("username");
		String upaswd=request.getParameter("password");
		
		pw.println("User Name:"+uname+"<br/>");
		pw.println("Password:"+upaswd+"<br/>");
		
		if(uname.equals("sushovan47")&&upaswd.equals("12345"))
		{
			pw.println("<html><body>");
			pw.println("<h1><font color=\"green\"/>Successfully logged in at:"+ new Date()+"</h1>");
			pw.println("</html></body>");
		}
		else
		{
			pw.println("<html><body>");
			pw.println("<h2><font color='red'/>OOPS!!! You are entered invalid User Name or Password please Check again.."+ new Date()+"</h2>");
			pw.println("</body></html>");
		}
		
		
	}

}
