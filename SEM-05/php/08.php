<!-- Perfect Numbers -->

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Perfect Numbers</title>
</head>

<center>
<body>
	<h2>Perfect Numbers</h2>
	<form action=" " method="POST" name="read_form">
		<label for="limit">Enter the limit </label>
		<input type="number" name="limit">
		<input type="submit" value="Submit">
	</form>
</body>

<?php
	if ($_POST) {
		$lim = $_POST['limit'];

		echo "<br>Perfect Numbers upto the limit are ";
		for ($i = 1; $i <= $lim; $i++) {
			echo $i * $i . " ";
		}
	}
?>
</center>

</html>