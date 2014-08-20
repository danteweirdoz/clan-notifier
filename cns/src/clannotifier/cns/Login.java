package clannotifier.cns;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("login")
public class Login {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String login(@PathParam("username") String userName) {
		return "Hello " + userName;
	}
}
