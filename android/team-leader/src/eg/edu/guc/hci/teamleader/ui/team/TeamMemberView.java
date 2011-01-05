package eg.edu.guc.hci.teamleader.ui.team;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import eg.edu.guc.hci.teamleader.model.TeamManager;
import eg.edu.guc.hci.teamleader.server.model.User;
import eg.edu.guc.hci.teamleader.ui.R;

public class TeamMemberView extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.team_member);
		User temp = new User(); temp.setName("ashry");
		List<User> list;
		try {
			list = new TeamManager(temp).getMembers();
			User tm = list.get(getIntent().getIntExtra("position", 0));
			
			((TextView) findViewById(R.id.teamMemberName)).setText(tm.getName());
			((ListView) findViewById(R.id.teamMemberList))
					.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item,
							new String[] { "Name\n" + tm.getName(), "Age\n22",
									"Position\n" + tm.getType_id(), "Team\nTeam 1" }));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
