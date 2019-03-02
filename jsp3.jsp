<%@ page language="java" contentType="text/html;"%>
<%@ include file="Common.jsp" %>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<form action="HttpServletDemo2" method="post">
<table>
	<tr bgcolor="pink">
		<td colspan="2" >Sign Up Here</td>
	</tr>
	<tr>
		<td>User Name</td>
		<td><input type="text" name="USERNAME" required/></td>
	</tr>
	<tr>
		<td>E mail Id</td>
		<td><input type="text" name="EMAIL" required/></td>
	</tr>
	<tr>
		<td>Mobile No</td>
		<td><input type="text" name="MOBILE" required/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="PASSWORD" required/></td>
	</tr>
	<tr>
		<td>Qualification</td>
		<td><input type="checkbox" name="USERQUALIFICATION" value="BCA"/>BCA
		<input type="checkbox" name="USERQUALIFICATION" value="MCA"/>MCA
		<input type="checkbox" name="USERQUALIFICATION" value="BBA"/>BBA
		<input type="checkbox" name="USERQUALIFICATION" value="MBA"/>MBA
		<input type="checkbox" name="USERQUALIFICATION" value="BSC"/>BSC
		<input type="checkbox" name="USERQUALIFICATION" value="MSC"/>MSC
		<input type="checkbox" name="USERQUALIFICATION" value="BTECH"/>BTECH
		<input type="checkbox" name="USERQUALIFICATION" value="MTECH"/>MTECH
		<input type="checkbox" name="USERQUALIFICATION" value="Any Other"/>Other
		</td>
	<tr>
		<td>Gender</td>
		<td><input type="radio" name="GENDER" value="MALE"/>Male
		<input type="radio" name="GENDER" value="FEMALE"/>Female
		<input type="radio" name="GENDER" value="TRANSGENDER"/>Transgender
		</td>
	</tr>
	<tr>
		<td>Technologies</td>
		<td><input type="radio" name="TECHNOLOGY" value="C"/>C
		<input type="radio" name="TECHNOLOGY" value="C++"/>C++
		<input type="radio" name="TECHNOLOGY" value="JAVA"/>JAVA
		<input type="radio" name="TECHNOLOGY" value="PYTHON"/>PYTHON
		<input type="radio" name="TECHNOLOGY" value="C#"/>C#
		<input type="radio" name="TECHNOLOGY" value="Any Other"/> Other
		
		</td>
	</tr>
	<tr>
		<td>Comments</td>
		<td><textarea cols="20" rows="5" name="COMMENTS" required></textarea></td>
	</tr>
	<tr bgcolor="yellow">
			<td colspan="2">
			<center><input type="submit" value="Sign Up"/></center>
			</td>
	</tr>
</form>
</table>
</body>
</html>