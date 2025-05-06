<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Contacts</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="bg-light">

<div class="container mt-5">
    <!-- Logout button positioned at top right -->
    <div class="position-absolute top-0 end-0 m-3">
        <form action="/contact-manager/logout/userlogout" method="get">
            <button type="submit" class="btn btn-danger btn-sm">Logout</button>
        </form>
    </div>

    <h2 class="text-center text-primary mb-4">Contact List</h2>

    <div class="card border-0 shadow-sm">
        <div class="card-body">
            <table class="table table-striped table-bordered">
                <thead>
                    <tr>
                        <th>Contact Id</th>
                        <th>Name</th>
                        <th>Phone Number</th>
                        <th>Email</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="cont" items="${uclist}">
                        <tr>
                            <td>${cont.cid}</td>
                            <td>${cont.name}</td>
                            <td>${cont.phoneno}</td>
                            <td>${cont.email}</td>
                            <td>
                                <a href="editcontact/${cont.cid}" class="btn btn-warning btn-sm">Edit</a>
                                <a href="deletecontact/${cont.cid}" class="btn btn-danger btn-sm">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <div class="text-center mt-3">
        <form action="addnewcontact">
            <button type="submit" class="btn btn-success">Add New Contact</button>
        </form>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>