<%@ page language="java" contentType="text/html;"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="JSPDemo1" method="get">
<table>
	<tr bgcolor="pink">
		<center><td colspan="2">Login Here</td></center>
	</tr>
	<tr>
		<td>User Name</td>
		<td><input type="text" name="username" required/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="password" required/></td>
	</tr>
	<tr bgcolor="magenta">
		<td colspan="2">
		<center><input type="submit" value="Log In"/></center>
		</td>
	</tr>
</form>
</body>
</html>