<!-- File upload -->

<!DOCTYPE html>
<html lang="en">
<head>
	<title>File Upload</title>
</head>
<body>
	<form action=" " method="post" enctype="multipart/form-data">
		Select file <input type="file" name="image"><br>
		<input type="submit" value="Submit">
	</form>

	<?php
		if (isset($_FILES['image'])) {
			echo "File name: ".$_FILES['image']['name'];
			echo "<br> File size: ".$_FILES['image']['size'];
			echo "<br> File type: ".$_FILES['image']['type'];
			echo "<br> Succesfully Uploaded";
		}
	?>
</body>
</html>