<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<div align="center">
<a href="signup" class="btn btn-primary btn-lg active" role="button" >Sign Up</a>
<h1>Login Information</h1>
<form:form action="login_user" method="post" modelAttribute="user">
<table>
<tr>
<td>User name:</td>
<td>
<form:input path="username"/>
</td>
</tr>
<tr>
<td>Password:</td>
<td><form:input path="password" /></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="Login" /></td>
</tr>
</table>

</form:form>
</div>
</body>
</html>