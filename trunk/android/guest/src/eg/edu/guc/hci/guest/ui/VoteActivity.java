package eg.edu.guc.hci.guest.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class VoteActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vote);
		int id = this.getIntent().getExtras().getInt("id");
		setVisible(id);
	}

	private void setVisible(int id) {
		LinearLayout v0 = (LinearLayout) findViewById(R.id.vote0);
		LinearLayout v1 = (LinearLayout) findViewById(R.id.vote1);
		LinearLayout v2 = (LinearLayout) findViewById(R.id.vote2);
		LinearLayout v3 = (LinearLayout) findViewById(R.id.vote3);
		int visable = LinearLayout.VISIBLE;
		int gone = LinearLayout.GONE;
		switch (id) {
		case 0:
			v0.setVisibility(visable);
			v1.setVisibility(gone);
			v2.setVisibility(gone);
			v3.setVisibility(gone);
			break;
		case 1:
			v0.setVisibility(gone);
			v1.setVisibility(visable);
			v2.setVisibility(gone);
			v3.setVisibility(gone);
			break;
		case 2:
			v0.setVisibility(gone);
			v1.setVisibility(gone);
			v2.setVisibility(visable);
			v3.setVisibility(gone);
			break;
		case 3:
			v0.setVisibility(gone);
			v1.setVisibility(gone);
			v2.setVisibility(gone);
			v3.setVisibility(visable);
			break;
		}
	}

	public void vote(View v) {
		Toast.makeText(this, "Your vote was submitted successfully, thanks", Toast.LENGTH_SHORT).show();
		finish();
	}
}