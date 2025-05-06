<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="bg-light">

<div class="container mt-5">
    <!-- Logout button positioned at top right -->
    <div class="position-absolute top-0 end-0 m-3">
        <form action="/contact-manager/logout/adminlogout" method="get">
            <button type="submit" class="btn btn-danger btn-sm">Logout</button>
        </form>
    </div>

    <h2 class="text-center text-primary mb-4">Registered Users</h2>

    <c:if test="${not empty msg}">
        <div class="alert alert-info text-center">${msg}</div>
    </c:if>

    <div class="card border-0 shadow-sm">
        <div class="card-body">
            <table class="table table-striped table-bordered">
                <thead>
                    <tr>
                        <th>User ID</th>
                        <th>Username</th>
                        <th>Role</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="u" items="${ulist}">
                        <tr>
                            <td>${u.uid}</td>
                            <td>${u.username}</td>
                            <td>${u.role}</td>
                            <td>
                                <a href="edituser/${u.uid}" class="btn btn-warning btn-sm">Edit</a> /
                                <a href="deleteuser/${u.uid}" class="btn btn-danger btn-sm"
                                   onclick="return confirm('Are you sure you want to delete this user?');">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>