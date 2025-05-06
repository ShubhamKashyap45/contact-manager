<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Edit User</title>
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
                <h3 class="text-primary">Edit User</h3>
            </div>

            <!-- Form to Edit User Details -->
            <form action="/contact-manager/admin/updateuser" method="post">
                <div class="mb-3">
                    <label for="uid" class="form-label">User ID</label>
                    <input type="text" class="form-control" name="uid" id="uid" value="${user.uid}" readonly>
                </div>

                <div class="mb-3">
                    <label for="username" class="form-label">Username</label>
                    <input type="text" class="form-control" name="username" id="username" value="${user.username}" required>
                </div>

                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" class="form-control" name="password" id="password" value="${user.password}" required>
                </div>

                <div class="mb-3">
                    <label for="role" class="form-label">Role</label>
                    <select name="role" id="role" class="form-select" required>
                        <option value="admin" ${user.role == 'admin' ? 'selected' : ''}>Admin</option>
                        <option value="user" ${user.role == 'user' ? 'selected' : ''}>User</option>
                    </select>
                </div>

                <!-- Centered Submit Button -->
                <div class="btn-container">
                    <button type="submit" class="btn btn-primary btn-sm" style="width: 150px;">Update User</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
