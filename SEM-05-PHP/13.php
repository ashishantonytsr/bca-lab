<!-- Array Functions -->

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Array Functions</title>
</head>
<body>
	<h2>Array Functions in PHP</h2>
	<?php
		function display ($array) {
			foreach ($array as $item) {
				echo $item. " ";
			}
		}

		$arr = array('Grapes', 'Apple', 'Orange', 'Cherry', 'Banana', 'Strawberry', 'Apple', 'Banana');

		echo "<b> Array items : </b> <br>";
		display($arr);

		echo "<br><br> <b> Array without duplicates : </b> <br>";
		$unique_array = array_unique($arr);
		display($unique_array);

		echo "<br><br> <b> Array after sorting : </b> <br>";
		sort($arr);
		display($arr);
		
		echo "<br><br> <b> Array after reverse sorting : </b><br>";
		rsort($arr);
		display($arr);

		echo "<br><br> <b> Array after deleting last element : </b><br>";
		unset($arr[count($arr)-1]);
		display($arr);

	?>
</body>
</html>