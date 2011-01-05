package eg.edu.guc.hci.teamleader.ui.task;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import eg.edu.guc.hci.teamleader.model.TeamManager;
import eg.edu.guc.hci.teamleader.server.model.User;
import eg.edu.guc.hci.teamleader.ui.R;

public class TaskMemberView extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.task_view);
		User temp = new User(); temp.setName("ashry");
		List<User> list;
		try {
			list = new TeamManager(temp).getMembers();
			User tm = list.get(getIntent().getIntExtra("position", 0));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
