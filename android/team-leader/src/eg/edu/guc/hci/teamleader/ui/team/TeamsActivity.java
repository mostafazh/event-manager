package eg.edu.guc.hci.teamleader.ui.team;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import eg.edu.guc.hci.teamleader.model.AllUsers;
import eg.edu.guc.hci.teamleader.model.TeamManager;
import eg.edu.guc.hci.teamleader.server.model.User;
import eg.edu.guc.hci.teamleader.ui.R;

public class TeamsActivity extends ListActivity implements OnItemClickListener {

	private TeamsAdapter TeamsAdapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		this.TeamsAdapter = new TeamsAdapter(this, R.layout.team_member_item,
				new ArrayList<User>());
		setListAdapter(this.TeamsAdapter);
		
		User temp = new User(); temp.setName("ashry");
		List<User> userList;
		try {
			//userList = new TeamManager(temp).getMembers();
			userList = new AllUsers().getUsers();
			for (User user : userList) {
				TeamsAdapter.notifyDataSetChanged();
				TeamsAdapter.add(user);
			}
			TeamsAdapter.notifyDataSetChanged();

			getListView().setOnItemClickListener(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			}

	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		startActivity(new Intent(this, TeamMemberView.class).putExtra(
				"position", arg2));
	}
}
