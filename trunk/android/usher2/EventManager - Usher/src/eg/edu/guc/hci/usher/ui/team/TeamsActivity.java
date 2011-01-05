package eg.edu.guc.hci.usher.ui.team;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import eg.edu.guc.hci.usher.model.TeamMember;
import eg.edu.guc.hci.usher.model.Teams;
import eg.edu.guc.hci.usher.ui.R;

public class TeamsActivity extends ListActivity implements OnItemClickListener {

	private TeamsAdapter TeamsAdapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		this.TeamsAdapter = new TeamsAdapter(this, R.layout.team_member_item,
				new ArrayList<TeamMember>());
		setListAdapter(this.TeamsAdapter);

		List<TeamMember> countryList = new Teams().getTeamsMembers();

		for (TeamMember country : countryList) {
			TeamsAdapter.notifyDataSetChanged();
			TeamsAdapter.add(country);
		}
		TeamsAdapter.notifyDataSetChanged();

		getListView().setOnItemClickListener(this);
	}

	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		startActivity(new Intent(this, TeamMemberView.class).putExtra(
				"position", arg2));
	}
}
