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

import eg.edu.guc.hci.server.model.Team;
import eg.edu.guc.hci.server.model.TeamFactory;
import eg.edu.guc.hci.server.model.User;
import eg.edu.guc.hci.server.model.util.ConnectionManager;

/**
 * This is the Web Service Class where all the "Team" related WS should be
 * found.
 * 
 * @author Ashry
 * 
 */
@Path("/team")
public class TeamResource {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	ConnectionManager<Team> cm = new ConnectionManager<Team>(new TeamFactory(),
			true);

	String id;

	@GET
	@Path("getTeamByMember")
	@Produces(MediaType.TEXT_PLAIN)
	public String getTeamByMember(@QueryParam("username") @DefaultValue("") String username) {
		ArrayList<Team> r = cm.executeDML("select "+Team.team_id_column+", "+Team.name_column+
										  " from user, team "+
										  "where "+User.username_column+" = "+username+
										  " and "+User.team_id_column+" = "+Team.team_id_column);
		for (Team team : r) {
			return team.toXML();
		}
		return "not-found";
	}

}
