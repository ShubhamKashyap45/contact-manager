<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contact</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<body class="bg-light">

	<div class="container mt-5">
		<h3 class="text-center text-primary mb-4">Add New Contact</h3>

		<div class="row justify-content-center">
			<div class="col-md-6 col-lg-5">
				<div class="card border-0 shadow-sm">
					<div class="card-body">
						<form action="insertcontact" method="post">

							<div class="mb-3">
								<label for="name" class="form-label">Name</label> <input
									type="text" class="form-control" name="name" id="name" required
									title="Enter the contact's name">
							</div>


							<div class="mb-3">
								<label for="phno" class="form-label">Phone Number</label> <input
									type="tel" class="form-control" name="phoneno" id="phno"
									required pattern="[0-9]{10}" maxlength="10" inputmode="numeric"
									title="Enter a 10-digit phone number">
							</div>

							<div class="mb-3">
								<label for="emailid" class="form-label">Email Address</label> <input
									type="email" class="form-control" name="email" id="emailid"
									required title="Enter a valid email address">
							</div>

							<button type="submit" class="btn btn-success w-100">Add
								Contact</button>
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
