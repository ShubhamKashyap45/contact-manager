<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Edit Contact</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" />
    <style>
        .edit-card {
            min-height: 350px;
        }
    </style>
</head>
<body class="bg-light">

<!-- Full-height flex container to center everything -->
<div class="container-fluid min-vh-100 d-flex justify-content-center align-items-center">
    <div class="w-100" style="max-width: 700px;">
        <!-- Move heading inside the centered block -->
        <div class="text-center mb-4">
            <h3 class="text-primary">Edit Contact</h3>
        </div>

        <div class="card border-0 shadow-sm edit-card">
            <div class="card-body">
                <form action="/contact-manager/contacts/updatecontact" method="post">
                    <div class="mb-3">
                        <label for="cid" class="form-label">Contact ID</label>
                        <input type="text" class="form-control" name="cid" id="cid" value="${cont.cid}" readonly>
                    </div>

                    <div class="mb-3">
                        <label for="phno" class="form-label">Phone Number</label>
                        <input type="tel" class="form-control" name="phoneno" id="phno"
                               value="${cont.phoneno}" required pattern="[0-9]{10}" maxlength="10"
                               inputmode="numeric" title="Enter a 10-digit phone number">
                    </div>

                    <div class="mb-3">
                        <label for="emailid" class="form-label">Email Address</label>
                        <input type="email" class="form-control" name="email" id="emailid"
                               value="${cont.email}" required title="Enter a valid email address">
                    </div>

                    <button type="submit" class="btn btn-primary w-100">Update Contact</button>
                </form>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
