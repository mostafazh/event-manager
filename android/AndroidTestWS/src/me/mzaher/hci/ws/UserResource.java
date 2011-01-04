package me.mzaher.hci.ws;

import me.mzaher.hci.ws.util.RequestMethod;
import me.mzaher.hci.ws.util.RestClient;
import android.util.Log;
import eg.edu.guc.hci.server.model.User;
import eg.edu.guc.hci.server.model.UserFactory;

public class UserResource {

	public User getAdmin() throws Exception {
		RestClient client = new RestClient(getBaseURI() + "/admin");
		client.Execute(RequestMethod.GET);
		Log.e("HCI1", client.getResponse());
		Log.e("HCI2", client.getResponse());
		return new UserFactory().newModel(client.getResponse());
	}

	public boolean login(String username, String password) throws Exception {
		RestClient client = new RestClient(getBaseURI() + "/login");
		client.AddParam("username", username);
		client.AddParam("password", password);
		client.Execute(RequestMethod.GET);
		Log.d("HCI", "\'" + client.getResponse()+ "\'");
		Log.d("HCI", "" + Boolean.parseBoolean(client.getResponse()));
		return Boolean.parseBoolean(client.getResponse());
	}

	private String getBaseURI() {
		return "http://192.168.1.103:8080/EventManager_-_Server/rest/user";
	}
}
