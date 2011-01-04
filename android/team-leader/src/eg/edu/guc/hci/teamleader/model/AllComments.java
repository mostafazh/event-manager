package eg.edu.guc.hci.teamleader.model;

import java.util.ArrayList;

import eg.edu.guc.hci.teamleader.server.model.Comment;

public class AllComments {
	
	private ArrayList<Comment> comments = new ArrayList<Comment>();
	
	public AllComments(){}
	
	public AllComments(ArrayList<Comment> comments){
		this.setcomments(comments);
	}

	public void setcomments(ArrayList<Comment> comments) {
		this.comments = comments;
	}

	public ArrayList<Comment> getComments() {
		return comments;
	}
	
	public void addComment(Comment c){
		comments.add(c);
	}
	
	public Comment getComment(int index){
		return comments.get(index);
	}
	
	public ArrayList<Comment> getAllComments(){
		String query = "";
		//
		// HERE WRITE THE QUERY
		//
		return getComments(query);
	}
	
	public ArrayList<Comment> getComments(String query){
		//
		//	HERE IS THE CODE TO EXECUTE THE QUERY
		//
		return comments;
	}
	
}
