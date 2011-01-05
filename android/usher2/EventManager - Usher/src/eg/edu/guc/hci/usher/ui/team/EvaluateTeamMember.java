package eg.edu.guc.hci.usher.ui.team;

import eg.edu.guc.hci.usher.ui.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EvaluateTeamMember extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.evaluate_team_member);
	}

	public void evaluateClick(View v) {
		Toast.makeText(this, "Your evaluation was successfully submitted.", Toast.LENGTH_SHORT).show();
		finish();
	}
}
