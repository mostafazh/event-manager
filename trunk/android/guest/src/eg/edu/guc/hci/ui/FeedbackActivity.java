package eg.edu.guc.hci.ui;

import eg.edu.guc.hci.ui.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FeedbackActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feedback);
	}

	public void sendFeedback(View v) {
		Log.i("Even Manager", "Feedback Sent");
	}
}
