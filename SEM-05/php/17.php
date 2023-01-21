<!-- Login Page -->

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login</title>
</head>
<body>
	<form action=" " method="post">
		Username <input type="text" name="user"><br>
		Password <input type="password" name="password"><br>
		<input type="submit" value="Submit">
	</form>

	<?php
		if ($_POST) {
			$user = $_POST['user'];
			$password = $_POST['password'];

			$con = pg_connect("host=localhost user=postgres password=postgres dbname=dbc_php");
			if ($con) {
				$query = "select * from login where username='$user' and password='$password'";
				$result = pg_query($con, $query);

				if (!$result)
					echo "Login Denied";
				else
					echo "User $user is successfully logged in";
			}
		}
	?>
</body>
</html>