/**
 * manages the credentials for the user
 * 
 * linked to element #credentials
 * 
 * exports credentials after user authenticates for the first time.
 */
(function(exports){
	var form = document.getElementById('credentials');
	
	form.onsubmit = function() {
		
		return false;
	};
})(window);