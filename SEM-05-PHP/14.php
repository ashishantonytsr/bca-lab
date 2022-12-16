<!DOCTYPE html>
<html lang="en">
<head>
	<title>Product DB</title>
</head>
<body>
	<center>
	<h2>Enter the Product Details</h2>
	<form action="" method="post">
		<input type="number" name="icode" placeholder="Item Code"><br>
		<input type="text" name="iname" placeholder="Item Name"><br>
		<input type="number" name="iprice" placeholder="Item Price"><br>
		<input type="submit" value="Add Data" name="sub_btn"><br>
		<input type="submit" value="Display Data" name="display_btn"><br><br>
	</form>

	<?php

		$con_str = "host=localhost port=5432 user=ashish password=ashish.10 dbname=ashish";
		$con = pg_connect($con_str);

		if (isset($_POST['sub_btn'])) {	
			$icode = $_POST['icode'];
			$iname = $_POST['iname'];
			$iprice = $_POST['iprice'];

			$insert_query = "insert into products(icode, iname, iprice) 
												values($icode, '$iname', $iprice)";
			$insert_query_result = pg_query($con, $insert_query);
			if (!$insert_query_result) 
				echo "Error: Couldn't insert values into database";
			else
				echo "Success: Data added successfully";
		}
		
		if (isset($_POST['display_btn'])) {
			$display_query = "select * from products";
			$display_query_result = pg_query($con, $display_query);
	
			echo "<table border=1><tr> <th>Item Code</th> <th>Name</th> <th>Price</th> </tr>";
			while ($row = pg_fetch_row($display_query_result)) {
				echo "<tr> <td> $row[0] </td>";
				echo "<td> $row[1] </td>";
				echo "<td> $row[2] </td> </tr>";
			}	
			echo "</table>";
		}
	?>

	</center>
</body>
</html>