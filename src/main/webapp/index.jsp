<html>
<style>
body {background-color: Moccasin; text-align: center}
h1   {color: MidnightBlue; text-align: center}
button {color : MidnightBlue}
</style>
<body>

<h1>Welcome to Book Management System</h1>
<form action = "http://localhost:8080/BookAppSpringJDBC/NewUserRegistration.jsp">
<button type="submit"><h3>Register</h3></button>
</form>
<form action="LoginServlet" method="post">
<h5>-OR-</h5><h3>Login</h3>
<input type="text" name="username" placeholder = "Enter Username" required>
<br>
<input type="password" name="password" placeholder = "Enter Password" required>
<br>
<br>
<button type="submit">Login</button>
<br>
</form>
<a href="http://localhost:8080/BookAppSpringJDBC/ResetPassword.jsp">Forgot Password??</a>
</body>
</html>