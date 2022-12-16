<!-- Bio-Data -->

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Bio-Data</title>
</head>
<body>
	<center>
		<h1>Enter Your Details</h1>
		<form action=" " method="POST" name="read_form">
			
			<label>Name</label>
			<input type="text" name="name">
			<br><br>
			
			
			<label>Address</label>
			<textarea rows="5" cols="20" name="address"></textarea>
			<br><br>

			<label>Gender</label>
			<input type="radio" name="gender" value="male">Male
			<input type="radio" name="gender" value="female">Female
			<br><br>

			<label>Qualification</label>
			<select name="qualification">
				<option value="sslc">SSLC</option>
				<option value="plus_two">Plus Two</option>
				<option value="ug">UG</option>
				<option value="pg">PG</option>
			</select>
			<br><br>

			<input type="submit" value="Submit">
		</form>
	</center>
</body>

<center>
<?php
	if ($_POST) {
		echo "<br><br> <h2>Student Details</h2> <br>";
		echo "Name: ".$_POST['name']."<br>";
		echo "Address: ".$_POST['address']."<br>";
		echo "Gender: ".$_POST['gender']."<br>";
		echo "Qualification: ".$_POST['qualification']."<br>";
	}
?>
</center>

</html>