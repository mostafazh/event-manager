package eg.edu.guc.hci.teamleader.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TeamsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView textview = new TextView(this);
		textview.setText("This is the Teams tab");
		setContentView(textview);
	}
}
