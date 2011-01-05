package eg.edu.guc.hci.teamleader.model;

import java.util.ArrayList;

import eg.edu.guc.hci.teamleader.server.model.Task;
import eg.edu.guc.hci.teamleader.server.model.User;
import eg.edu.guc.hci.teamleader.ws.TaskResource;

public class TaskManager {
	
	private ArrayList<Task> tasks;
	
	public TaskManager(User u) throws Exception {
		setTasks(getTasksByUsername(u.getUsername()));
	}

	public TaskManager() {}

	
	public ArrayList<Task> getTasksByUsername(String username) throws Exception{
		return new TaskResource().getTasksByUsername(username);
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}
	
}
