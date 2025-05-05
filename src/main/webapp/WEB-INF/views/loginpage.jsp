<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Display message passed via redirect (flash attribute) -->
    <c:if test="${not empty msg}">
        <p style="color: green;">${msg}</p>
    </c:if>

	<form action="validate" method="post">
		Username: <input type="text" name="uname" id="unm" required> <br>
		Password: <input type="password" name="password" id="pass" required>
		<br>

		<button type="submit" name="btn" id="login">Login</button>
	</form>
	
	<br>
	<a href="/contact-manager/registeration/register">Register Me?</a>

</body>
</html>