package eg.edu.guc.hci.teamleader.model;

import java.util.ArrayList;

import eg.edu.guc.hci.teamleader.server.model.Message;

public class AllMessages {
	
	private ArrayList<Message> messages = new ArrayList<Message>();
	
	public AllMessages(){}
	
	public AllMessages(ArrayList<Message> messages){
		this.setmessages(messages);
	}

	public void setmessages(ArrayList<Message> messages) {
		this.messages = messages;
	}

	public ArrayList<Message> getMessages() {
		return messages;
	}
	
	public void addMessage(Message m){
		messages.add(m);
	}
	
	public Message getMessage(int index){
		return messages.get(index);
	}
	
	public ArrayList<Message> getAllMessages(){
		String query = "";
		//
		// HERE WRITE THE QUERY
		//
		return getMessages(query);
	}
	
	public ArrayList<Message> getMessages(String query){
		//
		//	HERE IS THE CODE TO EXECUTE THE QUERY
		//
		return messages;
	}
	
}
