package eg.edu.guc.hci.guest.model;

import java.util.ArrayList;

public class Vote {
	private long id;
	private String title;
	private ArrayList<Quesion> questions;

	public Vote(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
