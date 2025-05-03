<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/contact-manager/contacts/updatecontact" method="post">
Contact Id: <input type="text" name="cid" id="cid" value="${cont.cid}" readonly><br>

Enter Phone Number: <input
  type="tel"
  name="phoneno"
  id="phno"
  value="${cont.phoneno}"
  required
  pattern="[0-9]{10}"
  maxlength="10"
  inputmode="numeric"
  title="Enter a 10-digit phone number"
/>
Enter Email Id: <input type="text" name="email" id="emailid" value="${cont.email}" required>

<button type="submit" name="btn" id="update">Update Contact</button>
</form>

</body>
</html>