<!-- Student Marklist -->

<html>
<head>
	<title>Student Marklist</title>
</head>
<body>
	<center>
	<form action="" method="post">
		<input type="submit" value="Insert Data" name="index_insert_btn">
		<input type="submit" value="Display MarkList" name="index_details_btn">
	</form>

	<?php
		$con = pg_connect("host=localhost user=postgres password=postgres dbname=dbc_php");

		if (isset($_POST['index_insert_btn'])) {
			echo "<h2>Enter the Student Details</h2>";
			echo "<form action='' method='post'>";
			echo "	<input type='number' name='regno' placeholder='Register Number'><br>";
			echo "	<input type='text' name='name' placeholder='Student Name'><br>";
			echo "	<input type='number' name='mark' placeholder='Mark'><br>";
			echo "	<input type='text' name='grade' placeholder='Grade'><br>";
			echo "	<input type='submit' value='Submit' name='insert_btn'><br>";
			echo "</form>";
		}
		if (isset($_POST['insert_btn'])) {	
			$regno = $_POST['regno'];
			$name = $_POST['name'];
			$mark = $_POST['mark'];
			$grade = $_POST['grade'];

			$insert_query = "insert into student values($regno, '$name', $mark, '$grade')";
			$insert_query_result = pg_query($con, $insert_query);
			if (!$insert_query_result)  echo "Couldn't insert values";
			else  echo "Data added successfully";
		}
	?>

	<?php
		if (isset($_POST['index_details_btn'])) {
			echo "<h2>Enter Your Register Number</h2>";
			echo "<form action='' method='post'>";
			echo "	<input type='number' name='regno' placeholder='Register Number'><br>";
			echo "	<input type='submit' value='Display' name='display_btn'><br><br>";
			echo "</form>";
		}
		if (isset($_POST['display_btn'])) {
			$display_query = "select * from student where regno=".$_POST['regno'];
			$display_query_result = pg_query($con, $display_query);
			
			if (!$display_query_result)  echo "Details Not Found";
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