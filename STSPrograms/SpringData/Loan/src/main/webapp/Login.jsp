<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
	background-color: gray;
	padding: 5px;
	border-collapse: collapse;
}
.a{
text-align: center;

}
</style>
</head>
<body>
<center>
	<form action="/login" method="post">
		<table border="3">
			<tr>
				<td class="a">UserName: <input type="text" name="username">
				</td>
			</tr>
			<tr>
				<td class="a">PassWord: <input type="text" name="password">
				</td>
			</tr>
			
			<tr >
				<td class="a"><input type="submit" value="Next"></td>
			</tr>

		</table>
		
	</form>
	</center>
</body>
</html>