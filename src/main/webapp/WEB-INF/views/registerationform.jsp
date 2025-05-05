<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card border-0 shadow-sm">
                <div class="card-body">
                    <h4 class="text-center text-primary mb-4">Register</h4>

                    <form action="registeruser" method="post">
                        <div class="mb-3">
                            <label for="usrname" class="form-label">Name</label>
                            <input type="text" class="form-control" name="name" id="usrname" required>
                        </div>

                        <div class="mb-3">
                            <label for="age" class="form-label">Age</label>
                            <input type="number" class="form-control" name="age" id="age" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label d-block">Gender</label>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gender" value="male" id="male" required>
                                <label class="form-check-label" for="male">Male</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gender" value="female" id="female">
                                <label class="form-check-label" for="female">Female</label>
                            </div>
                        </div>

                        <div class="mb-3">
                            <label for="usrphno" class="form-label">Phone Number</label>
                            <input type="tel" class="form-control" name="userphone" id="usrphno" pattern="[0-9]{10}" maxlength="10" required title="Enter a 10-digit phone number">
                        </div>

                        <div class="mb-3">
                            <label for="unm2" class="form-label">Username</label>
                            <input type="text" class="form-control" name="username" id="unm2" required>
                        </div>

                        <div class="mb-3">
                            <label for="pass2" class="form-label">Password</label>
                            <input type="password" class="form-control" name="password" id="pass2" required>
                        </div>

                        <button type="submit" class="btn btn-success w-100">Register</button>
                    </form>

                    <div class="mt-3 text-center">
                        <a href="/contact-manager/security/login">Already have an account? Login</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
