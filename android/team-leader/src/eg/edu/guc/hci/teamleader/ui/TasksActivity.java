package eg.edu.guc.hci.teamleader.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TasksActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView textview = new TextView(this);
		textview.setText("This is the Tasks tab");
		setContentView(textview);
	}
}
