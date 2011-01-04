package eg.edu.guc.hci.teamleader.model;

import java.util.ArrayList;

import eg.edu.guc.hci.teamleader.server.model.Task;

public class AllTasks {
	
	private ArrayList<Task> tasks = new ArrayList<Task>();
	
	public AllTasks(){}
	
	public AllTasks(ArrayList<Task> tasks){
		this.setTasks(tasks);
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}
	
	public void addTask(Task t){
		tasks.add(t);
	}
	
	public Task getTask(int index){
		return tasks.get(index);
	}
	
	public ArrayList<Task> getAllTasks(){
		String query = "";
		//
		// HERE WRITE THE QUERY
		//
		return getTasks(query);
	}
	
	public ArrayList<Task> getTasks(String query){
		//
		//	HERE IS THE CODE TO EXECUTE THE QUERY
		//
		return tasks;
	}
	
}
