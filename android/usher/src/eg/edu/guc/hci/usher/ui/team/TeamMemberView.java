package eg.edu.guc.hci.usher.ui.team;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import eg.edu.guc.hci.usher.model.TeamMember;
import eg.edu.guc.hci.usher.model.Teams;
import eg.edu.guc.hci.usher.ui.R;

public class TeamMemberView extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.team_member);
		List<TeamMember> list = new Teams().getTeamsMembers();
		TeamMember tm = list.get(getIntent().getIntExtra("position", 0));

		((ListView) findViewById(R.id.teamMemberList))
				.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item,
						new String[] { "Name\n" + tm.getName(), "Age\n22",
								"Position\n" + tm.getType(), "Team\nTeam 1" }));
	}
}
