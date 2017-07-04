<html>
<head>
<title>New User Registration</title>
</head>
<style>
body {background-color: Moccasin; text-align: center}
h3   {color: MidnightBlue; text-align: center}
button {color : MidnightBlue}
</style>
<body>

<h3>Welcome to Book Management System - New User Registration</h3>

<form action="NewUserRegisterServlet" method="post">
	<input type="number" name="id" placeholder = "Enter ID" required><br> 
	<input type="text" name="name" placeholder = "Enter Name"required><br>
	<input type="text" name="userName" placeholder = "Enter Username" required><br>       
    <input type="password" name="password" placeholder = "Enter Password" required><br>       
	<input type="number" name="mobileNumber" placeholder = "Enter Mobile Number"><br>       
    <input type="text" name="emailID" placeholder = "Enter Email ID"><br>      
    <select name = "roleID">
    <option value = 0>---Choose Role ID---</option>
    <option value = 100>Admin</option>
    <option value = 200>Author</option>
    <option value = 300>User</option>
    </select>
	<br>
	<button type="submit">Register</button>
</form>
</body>
</html>

