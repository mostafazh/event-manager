package eg.edu.guc.hci.usher.ui;

import eg.edu.guc.hci.usher.ui.R;
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
		spec = tabHost.newTabSpec("Tasks").setIndicator("Tasks")
				.setContent(intent);
		tabHost.addTab(spec);

		// Do the same for the other tabs
		intent = new Intent(this, TasksActivity.class);
		spec = tabHost.newTabSpec("Teams").setIndicator("Teams")
				.setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent(this, ReportsActivity.class);
		spec = tabHost.newTabSpec("Reports").setIndicator("Reports")
				.setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent(this, InboxActivity.class);
		spec = tabHost.newTabSpec("Inbox").setIndicator("Inbox")
				.setContent(intent);
		tabHost.addTab(spec);

		tabHost.setCurrentTab(2);
	}
}