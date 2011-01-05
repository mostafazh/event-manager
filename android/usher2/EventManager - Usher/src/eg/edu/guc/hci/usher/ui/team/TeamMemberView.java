package eg.edu.guc.hci.usher.ui.team;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import eg.edu.guc.hci.usher.model.TeamMember;
import eg.edu.guc.hci.usher.model.Teams;
import eg.edu.guc.hci.usher.ui.CreateTextMessage;
import eg.edu.guc.hci.usher.ui.R;

public class TeamMemberView extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.team_member);
		List<TeamMember> list = new Teams().getTeamsMembers();
		TeamMember tm = list.get(getIntent().getIntExtra("position", 0));
		((TextView) findViewById(R.id.teamMemberName)).setText(tm.getName());
		((ListView) findViewById(R.id.teamMemberList))
				.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item,
						new String[] { "Age\n22", "Position\n" + tm.getType(),
								"Team Number\n1" }));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.team_member_view, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		startActivity(new Intent(this, EvaluateTeamMember.class));
		return true;
	}
}
