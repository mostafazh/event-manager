package eg.edu.guc.hci.teamleader.ui;

import eg.edu.guc.hci.teamleader.ui.R;
import eg.edu.guc.hci.teamleader.ui.task.TasksActivity;
import eg.edu.guc.hci.teamleader.ui.team.TeamsActivity;
//import eg.edu.guc.hci.usher.tasks.tasksActivity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class Main extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost(); // The activity TabHost
		TabHost.TabSpec spec; // Resusable TabSpec for each tab
		Intent intent; // Reusable Intent for each tab

		// Create an Intent to launch an Activity for the tab (to be reused)
		intent = new Intent(this, TasksActivity.class);

		// Initialize a TabSpec for each tab and add it to the TabHost
		spec = tabHost.newTabSpec("Tasks").setIndicator("Tasks",res.getDrawable(R.drawable.tasks))
				.setContent(intent);
		tabHost.addTab(spec);

		// Do the same for the other tabs
		intent = new Intent(this, TeamsActivity.class);
		spec = tabHost.newTabSpec("Teams").setIndicator("Teams",res.getDrawable(R.drawable.ppl))
				.setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent(this, ReportsActivity.class);
		spec = tabHost.newTabSpec("Reports").setIndicator("Reports",res.getDrawable(R.drawable.rep))
				.setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent(this, InboxActivity.class);
		spec = tabHost.newTabSpec("Inbox").setIndicator("Inobox",res.getDrawable(R.drawable.msg))
				.setContent(intent);
		tabHost.addTab(spec);

		tabHost.setCurrentTab(0);
	}
}