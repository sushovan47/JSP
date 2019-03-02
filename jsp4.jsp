<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html;"%>
<%@ page import ="java.sql.*" %>
<%@ include file="Common.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scriplet</title>
</head>
<body>
<h3>Declaration Scriplet</h3>
<%!
	Connection conn;
	ResultSet rst;
%>
<h3>Normal Scriplet</h3>
<%
	java.util.Date myDate=new java.util.Date();
	out.println("Today:"+myDate);
%>
<h3>Expresion Scriplet</h3>
1000+5000=<%=(1000+5000) %>
<br/><br/>
<%=new Date() %>;


</body>
</html>