<!-- Meter Tag -->

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Meter Tag</title>
</head>
<body>
	<center>
	<h1>Enter the city and temperature</h1>

	<form action=" " method="POST">
		First city <input type="text" name="city1">
		Temperature <input type="number" name="temp1">
		<br><br>

		Second city <input type="text" name="city2">
		Temperature <input type="number" name="temp2">
		<br><br>

		Third city <input type="text" name="city3">
		Temperature <input type="number" name="temp3">
		<br><br>

		<input type="submit" value="Submit" name="sub_btn">
	</form>

	<?php
		if(isset($_POST['sub_btn'])) {
			
			echo "<br> <h1>Temperature of Given Cities </h1> <h3>";

			echo $_POST['city1'];
			echo " <meter value=". $_POST['temp1'] ." min=1 max=50 low=10 high=40></meter>";

			echo "<br>". $_POST['city2'];
			echo " <meter value=". $_POST['temp2'] ." min=1 max=50 low=10 high=40></meter>";
			
			echo "<br>". $_POST['city3'];
			echo " <meter value=". $_POST['temp3'] ." min=1 max=50 low=10 high=40></meter>";

			echo "</h3> </center>";
		}
	?>
</body>
</html>