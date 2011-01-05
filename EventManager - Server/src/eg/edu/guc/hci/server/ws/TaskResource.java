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

import eg.edu.guc.hci.server.model.Task;
import eg.edu.guc.hci.server.model.TaskFactory;
import eg.edu.guc.hci.server.model.User;
import eg.edu.guc.hci.server.model.UserFactory;
import eg.edu.guc.hci.server.model.util.ConnectionManager;

/**
 * This is the Web Service Class where all the "Task" related WS should be
 * found.
 * 
 * @author Mostafa Zaher
 * 
 */
@Path("/task")
public class TaskResource {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	ConnectionManager<Task> cm = new ConnectionManager<Task>(new TaskFactory(),
			true);

	String id;

	@GET
	@Path("getTasksByUsername")
	@Produces(MediaType.TEXT_PLAIN)
	public String getTasksByUsername(@QueryParam("username") @DefaultValue("") String username) {
		ArrayList<Task> r = cm.executeDML("select task.* "+
										  "from task, user_task "+
										  "where task."+Task.task_id_column+" = "+"user_task.task_id and user_task.username = "+"\'"+username+"\'");
		
		for (Task task : r) {
			return task.toXML();
		}
		return "not-found";
	}

}
