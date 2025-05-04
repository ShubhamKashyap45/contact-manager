<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration Form</title>
</head>
<body>

<form action="registeruser" method="post">
Enter Name: <input type="text" name="name" id="usrname"> <br>
Enter Age: <input type="number" name="age" id="age"> <br>
Enter Gender: <input type="radio" name="gender" value="male" id="male"> Male
<input type="radio" name="gender" value="female" id="female"> Female <br>

Enter Phone Number: <input
  type="tel"
  name="userphone"
  id="usrphno"
  required
  pattern="[0-9]{10}"
  maxlength="10"
  inputmode="numeric"
  title="Enter a 10-digit phone number"
/>

<button type="submit" name="btn" id="reg"> Register Details</button>

</form>

</body>
</html>