<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="otpVerification" method="post"> 
<input type= "hidden" name="email" value="${ email }" >
<input type= "text" placeholder="Enter otp" name="otp" >
<button type="submit">Submit OTP</button>
</form>
</body>
</html>