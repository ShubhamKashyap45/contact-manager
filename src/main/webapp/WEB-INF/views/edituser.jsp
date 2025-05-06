<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Edit User</h2>
    <form action="/contact-manager/admin/updateuser" method="post">
        UserId: <input type="text" name="uid" id="uid" value="${user.uid}" readonly> <br>
        Username: <input type="text" name="username" id="username" value="${user.username}"><br>
        Password: <input type="password" name="password" id="password" value="${user.password}"><br>
        
        Role: 
        <select name="role" id="role">
            <option value="admin" ${user.role == 'admin' ? 'selected' : ''}>Admin</option>
            <option value="user" ${user.role == 'user' ? 'selected' : ''}>User</option>
        </select><br>
        
        <button type="submit" name="btn" id="updateUser">Update User</button>
    </form>
</body>
</html>