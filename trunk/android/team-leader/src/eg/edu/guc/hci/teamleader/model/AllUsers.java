package eg.edu.guc.hci.teamleader.model;

import java.sql.Date;
import java.util.ArrayList;

import eg.edu.guc.hci.teamleader.server.model.User;

public class AllUsers {
	
	private ArrayList<User> users = new ArrayList<User>();
	
	public AllUsers(){
		User user1 = new User("Ashry", "Ashry", "Mohamed Ashry", 1, 1, 1, "", 1);
		User user2 = new User("zaher", "user", "zaher zaher", 1, 1, 1, "", 2);
		User user3 = new User("Naja7", "user", "Mohamed Ashry", 1, 1, 1, "", 2);
		User user4 = new User("Ashraf", "user", "Mohamed Ashry", 1, 1, 1, "", 2);
		User user5 = new User("user4", "user", "Mohamed Ashry", 1, 1, 1, "", 2);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
	}
	
	public AllUsers(ArrayList<User> users){
		this.setUsers(users);
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public ArrayList<User> getUsers() {
		return users;
	}
	
	public void addUser(User t){
		users.add(t);
	}
	
	public User getUser(int index){
		return users.get(index);
	}
	
	public ArrayList<User> getAllUsers(){
		String query = "";
		//
		// HERE WRITE THE QUERY
		//
		return getUsers(query);
	}
	
	public ArrayList<User> getUsers(String query){
		//
		//	HERE IS THE CODE TO EXECUTE THE QUERY
		//
		return users;
	}
	
}
