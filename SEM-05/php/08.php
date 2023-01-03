<!-- Perfect Numbers -->

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Perfect Number</title>
	<link rel="stylesheet" href="./assets/css/html-01.css">
</head>

<center>
<body>
	<h2>Perfect Number</h2>
	<form action=" " method="POST" name="read_form">
		<label for="num">Enter the number </label>
		<input type="number" name="num"><br>
		<input type="submit" value="Submit">
	</form>
</body>

<?php
	if ($_POST) {
		$num = $_POST['num'];
		$sum = 0;
		for ($i = 1; $i < $num; $i++){
			if ($num % $i == 0)
				$sum += $i;
		}
		if ($sum > $num)
		 echo "$num is an Abundant Number";
		else if ($sum < $num)
			echo "$num is a Deficient Number";
		else
			echo "$num is a Perfect Number";
	}
?>
</center>

</html>