<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts</title>
</head>
<body>

<table border="2">
<tr>
	<th>Contact Id </th>
	<th>Phone Number</th>
	<th>Email</th>
	<th>Actions</th>	
</tr>
<c:forEach var="cont" items="${clist}">
 <tr>
 
 	<td>${cont.cid}</td>
 	<td>${cont.phoneno}</td>
 	<td>${cont.email}</td>
 	<td>
 		<a href="editcontact/${cont.cid}">Edit</a>
 		<a href="deletecontact/${cont.cid}">Delete</a>
 	</td>
 	
 </tr>

</c:forEach>

</table>

<form action="addnewcontact">
	<button type="submit" name="btn" id="add">Add New Contact</button>
</form>

</body>
</html>