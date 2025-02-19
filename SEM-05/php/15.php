<!-- Student Marklist -->

<html>
<head>
	<title>Student Marklist</title>
</head>
<body>
	<center>
		<h2>Enter Your Register Number</h2>
		<form action='' method='post'>
			<input type='number' name='regno' placeholder='Register Number'><br>
			<input type='submit' value='Display' name='display_btn'><br><br>
		<form>

	<?php
		if (isset($_POST['display_btn'])) {
			$con = pg_connect("host=localhost user=postgres password=postgres dbname=dbc_php");

			$display_query = "select * from student where regno=".$_POST['regno'];
			$display_query_result = pg_query($con, $display_query);
			$row = pg_fetch_row($display_query_result);
			
			if (!$display_query_result or count($row)<=1)  echo "Details Not Found";
			else {
				echo "<h2>Student MarkList</h2>";
				$row = pg_fetch_row($display_query_result);
				echo "Reg No.: $row[0]";
				echo "<br>Name: $row[1]";
				echo "<br>Mark: $row[2]";
				echo "<br>Grade: $row[3]";
			}
		}
	?>
	</center>
</body>
</html>