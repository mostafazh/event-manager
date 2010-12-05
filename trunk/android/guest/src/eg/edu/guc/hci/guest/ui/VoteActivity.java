package eg.edu.guc.hci.guest.ui;

import eg.edu.guc.hci.guest.ui.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class VoteActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vote);
		TextView t = (TextView) findViewById(R.id.vote_title);
		t.setText("" + this.getIntent().getExtras().getInt("id"));
	}
}