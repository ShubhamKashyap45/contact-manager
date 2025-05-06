<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>

<h2>Registered Users</h2>

<c:if test="${not empty msg}">
    <div class="alert alert-info text-center">${msg}</div>
</c:if>

<table border="2">
<tr>
   <th>User ID</th>
   <th>Username</th>
   <!-- <th>Password</th> -->
   <th>Role</th>
   <th>Actions</th>
</tr>

<c:forEach var="u" items="${ulist}">
  <tr>
    <td>${u.uid}</td>
    <td>${u.username}</td>
<%--     <td>${u. password}</td> --%>
    <td>${u.role}</td>
    <td>
      <a href="edituser/${u.uid}">edit</a> /
      <a href="deleteuser/${u.uid}" onclick="return confirm('Are you sure you want to delete this user?');">delete</a>
    </td>
  </tr>
</c:forEach>
</table>

</body>
</html>
