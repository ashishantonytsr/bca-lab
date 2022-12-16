<!-- Fruits List -->

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Fruits List</title>
</head>
<body>
	<h1>Select a Fruit</h1>
	<form action=" " method="POST" name="read_form">
		<select name="fruit">
			<option>Apple</option>
			<option>Grapes</option>
			<option>Orange</option>
			<option>Banana</option>
			<option>Strawberry</option>
		</select>
		<input type="submit" value="Submit">
	</form>
</body>

<?php
	if ($_POST) {
		echo "<br>The selected fruit is ".$_POST['fruit'];
	}
?>

</html>