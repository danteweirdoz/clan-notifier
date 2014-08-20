package clannotifier.cns;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("user")
public class User {
	
	@Path("user/login")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String login(@PathParam("username") String userName) {
		return "Hello " + userName;
	}

	// Called if TEXT_PLAIN is request
	// Called if XML is request
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello>Hello, World!" + "</hello>";
	}
	
	//Called if HTML is request
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "<html> <title> Hello! </title>" +
				"<body><h1> Hello, World! </h1> </body> </html>";  
	}
}