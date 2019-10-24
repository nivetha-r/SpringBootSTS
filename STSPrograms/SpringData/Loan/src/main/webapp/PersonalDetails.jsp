<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
	background-color: #DEB887;
}
.a{

text-align: center;
}

</style>
</head>
<body>
<center>
	<table border="3">
		<form action="login">
			<tr>
				<td>FirstName:<input type="text" name="firstname"></td>
			</tr>

			<tr>
				<td>LastName:<input type="text" name="lastname"></td>
			</tr>
			<tr>
				<td>State:   <input type="text" name="state"></td>
			</tr>
			<tr>
				<td>City:    <input type="text" name="city"></td>
			</tr>
			<tr>
				<td>Address: <input type="text" name="address"></td>
			</tr>
			
			<tr>
		 <td>Contact Number:<input type="text" name="contactno"></td>
			</tr>
			<tr>
				<td class="a"><input type="submit" value="Register"></td>
			</tr>
		</form>
	</table>
</center>
</body>
</html>