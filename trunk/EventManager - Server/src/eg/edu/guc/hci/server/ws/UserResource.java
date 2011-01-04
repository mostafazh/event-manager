package eg.edu.guc.hci.server.ws;

import java.util.ArrayList;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import eg.edu.guc.hci.server.model.User;
import eg.edu.guc.hci.server.model.UserFactory;
import eg.edu.guc.hci.server.model.util.ConnectionManager;

/**
 * This is the Web Service Class where all the "User" related WS should be
 * found.
 * 
 * @author Mostafa
 * 
 */
@Path("/user")
public class UserResource {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	ConnectionManager<User> cm = new ConnectionManager<User>(new UserFactory(),
			true);

	String id;

	@GET
	@Path("admin")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAdmin() {
		ArrayList<User> r = cm.executeDML("Select * FROM user");
		for (User user : r) {
			if (user.getType_id() == 2) {
				System.out.println(user.toXML());
				return user.toXML();
			}
		}
		return "not-found";
	}

	// This method is called if TEXT_PLAIN is request
	@GET
	@Path("login")
	@Produces(MediaType.TEXT_PLAIN)
	public String login(
			@QueryParam("username") @DefaultValue("") String username,
			@QueryParam("password") @DefaultValue("") String password) {
		ArrayList<User> r = cm.executeDML("SELECT * FROM user where "
				+ User.username_column + "=\'" + username + "\' and "
				+ User.password_column + "=\'" + password + "\'");
		return "" + (r.size() == 1);
	}
}
