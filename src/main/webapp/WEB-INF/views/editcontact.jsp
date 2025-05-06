<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Edit Contact</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" />
    <style>
        /* Center the form within the full viewport height */
        .edit-container {
            max-width: 700px;
            margin: 50px auto;
            padding: 30px;
            background-color: #fff;  /* Optional: White background */
            border-radius: 8px;  /* Optional: Round corners */
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);  /* Optional: Add slight shadow */
        }

        .edit-container h3 {
            font-size: 1.8rem;
            margin-bottom: 20px;
        }

        .form-control, .form-select {
            height: 40px;
        }

        .btn-normal {
            padding: 8px 16px;
            font-size: 1rem;
        }

        /* Remove card or any background styling */
        body {
            background-color: #f8f9fa; /* Soft background color */
        }

        .edit-container input,
        .edit-container select,
        .edit-container button {
            margin-bottom: 15px;
        }

        /* Center the submit button */
        .btn-container {
            display: flex;
            justify-content: center;
            margin-top: 20px;
        }

        /* Mobile responsiveness */
        @media (max-width: 768px) {
            .edit-container {
                margin: 20px;
            }
        }
    </style>
</head>
<body>

<!-- Full-height flex container to center everything -->
<div class="container-fluid min-vh-100 d-flex justify-content-center align-items-center">
    <div class="w-100">
        <!-- Simplified Edit Form Layout -->
        <div class="edit-container">
            <div class="text-center mb-4">
                <h3 class="text-primary">Edit Contact</h3>
            </div>

            <!-- Form to Edit Contact Details -->
            <form action="/contact-manager/contacts/updatecontact" method="post">
                <div class="mb-3">
                    <label for="cid" class="form-label">Contact ID</label>
                    <input type="text" class="form-control" name="cid" id="cid" value="${cont.cid}" readonly>
                </div>

                <div class="mb-3">
                    <label for="phoneno" class="form-label">Phone Number</label>
                    <input type="tel" class="form-control" name="phoneno" id="phoneno" value="${cont.phoneno}" required pattern="[0-9]{10}" maxlength="10" inputmode="numeric" title="Enter a 10-digit phone number">
                </div>

                <div class="mb-3">
                    <label for="email" class="form-label">Email Address</label>
                    <input type="email" class="form-control" name="email" id="email" value="${cont.email}" required title="Enter a valid email address">
                </div>

                <!-- Centered Submit Button -->
                <div class="btn-container">
                    <button type="submit" class="btn btn-primary btn-sm" style="width: 150px;">Update Contact</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
