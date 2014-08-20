/**
 * manages the credentials for the user
 * 
 * linked to element #credentials
 * 
 * exports credentials after user authenticates for the first time.
 */
(function(exports){
	var form = document.getElementById('credentials');
	var signup = document.getElementById('signup');
	
	var clickedSignup = false;
	
	signup.onclick = function(){clickedSignup = true; form.onsubmit()}
	
	form.onsubmit = function() {
		//TODO: input validation, return early on failure
		
		if (form.elements.remember.checked) {
			exports.credentials = localStorage;
		} else {
			exports.credentials = {};
		}
		exports.credentials.username = form.elements.username.value;
		exports.credentials.password = form.elements.password.value;
		
		if (clickedSignup) {
			//TODO: signup logic: request to endpoint to create new user
		} else {
			//TODO: login logic: try any page with auth, then move on to main page
		}
		
		clickedSignup = false;
		return false;
	};
})(window);