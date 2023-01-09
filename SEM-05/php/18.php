<!-- Keygen -->

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Keygen</title>
</head>
<body>
	<form action=" " method="post">
		Username <input type="text" name="user"><br>
		Encryption <keygen name="key">
		<input type="submit" value="Submit">
	</form>

	<?php
		if ($_POST) {
			echo "The two keys were generated<br>";
			echo "The private key is stored locally and public key is sent to server";
		}
	?>
</body>
</html>