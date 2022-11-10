<!-- Cookie -->

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Cookie</title>
</head>
<body>
	<?php
		setcookie('time',date("h:i:s"),time() + 7200);
		setcookie('date',date("d/m/y"),time() + 7200);

		echo "Last visited at ".$_COOKIE['date']. " On ". $_COOKIE['time'];
	?>
</body>
</html>