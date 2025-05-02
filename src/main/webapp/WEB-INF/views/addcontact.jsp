<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="insertcontact" method="post">
Enter Phone Number: <input
  type="tel"
  name="phoneno"
  id="phno"
  required
  pattern="[0-9]{10}"
  maxlength="10"
  inputmode="numeric"
  title="Enter a 10-digit phone number"
/>
Enter Email Id: <input type="text" name="email" id="emailid" required>

<button type="submit" name="btn" id="add">Add Contact</button>

</form>

</body>
</html>