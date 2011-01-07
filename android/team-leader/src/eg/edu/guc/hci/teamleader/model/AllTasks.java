package eg.edu.guc.hci.teamleader.model;

import java.sql.Date;
import java.util.ArrayList;

import eg.edu.guc.hci.teamleader.server.model.Task;

public class AllTasks {
	
	private ArrayList<Task> tasks = new ArrayList<Task>();
	
	public AllTasks(){
		Task task1 = new Task(1, "Task1", 1, "DESCRIPTION IS WRITTEN HERE 1", "VERY IMPORTANT 1", (new Date(2011,1,1)), 100);
		Task task2 = new Task(2, "Task1", 5, "DESCRIPTION IS WRITTEN HERE 2", "VERY IMPORTANT 2", (new Date(2011,1,2)), 80);
		Task task3 = new Task(3, "Task1", 3, "DESCRIPTION IS WRITTEN HERE 3", "VERY IMPORTANT 3", (new Date(2011,1,3)), 40);
		Task task4 = new Task(4, "Task1", 3, "DESCRIPTION IS WRITTEN HERE 4", "VERY IMPORTANT 4", (new Date(2011,1,4)), 70);
		Task task5 = new Task(5, "Task1", 4, "DESCRIPTION IS WRITTEN HERE 5", "VERY IMPORTANT 5", (new Date(2011,1,5)), 55);
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		tasks.add(task4);
		tasks.add(task5);
	}
	
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
