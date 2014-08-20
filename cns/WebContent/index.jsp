<!doctype html>
<html>
	<head>
		<link rel="stylesheet" href="css/normalize.css">
		<link rel="stylesheet" href="css/main.css">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script src="js/credentials.js" defer></script>
	</head>
	<body>
		<header class="clan-logo">
			<img src="img/symbols/50.png">
			<h1>Clan Notifier</h1>
		</header>
		<form id="credentials" class="credentials">
			<input type="text" placeholder="username" name="username" required>
			<br>
			<input type="password" placeholder="password" name="password" required>
			<br>
			<input type="checkbox" name="remember" id="remember"><label for="remember">Remember me</label>
			<br>
			<button type="button" id="signup" class="signup">Sign Up</button>
			<button type="submit" id="login" class="login">Log In</button>
		</form>
		<div class="session" id="session">
			<ul class="tabs">
				<li class="tab active"><a data-for="notifications" href>My Notification Settings</a></li>
				<li class="tab"><a data-for="management" href>Manage Members</a></li>
			</ul>
			<button type="button" id="logout" class="logout close">X</button>
			<div class="tab-content active" id="notifications">
				<ul class="emails" id="emails">
					<li><input type="email">
					<li><input type="email">
				</ul>
				<button>Add another email</button>
			</div>
			<div class="tab-content" id="management">
			
			</div>
		</div>
	</body>
</html>