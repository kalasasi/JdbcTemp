<html>
<head>
<title>Reset Password</title>
</head>
<style>
body {background-color: Moccasin; text-align: center}
h3   {color: MidnightBlue; text-align: center}
button {color : MidnightBlue}
</style>

<body>
<h3>Welcome to Book Management System - Reset Password</h3>

<form action="ResetPasswordServlet" method="post">
	<input type="text" name="userName" placeholder = "Enter Username" required><br>       
    <input type="password" name="oldPassword" placeholder = "Enter Old Password" required><br>       
    <input type="password" name="newPassword" placeholder = "Enter New Password" required><br> 
<br>

<button type="submit">Update Password</button>

</form>
</body>
</html>