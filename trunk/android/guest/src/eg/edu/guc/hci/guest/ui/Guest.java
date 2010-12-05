package eg.edu.guc.hci.guest.ui;

import eg.edu.guc.hci.guest.ui.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Guest extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void searchButtonClick(View v) {
		Log.i("Event Manager", "Search");
		startActivity(new Intent(this,SearchActivity.class));
	}

	public void mapsButtonClick(View v) {
		Log.i("Event Manager", "Maps");
		startActivity(new Intent(this,MapsActivity.class));
	}

	public void votesButtonClick(View v) {
		Log.i("Event Manager", "Votes");
		startActivity(new Intent(this,VotesActivity.class));
	}

	public void layarButtonClick(View v) {
		Log.i("Event Manager", "Layar");
//		startActivity(new Intent("eg.edu.guc.hci.ui.LAYAR_ACTIVITY"));
	}

	public void feedbackButtonClick(View v) {
		Log.i("Event Manager", "Feedback");
		startActivity(new Intent(this,FeedbackActivity.class));
	}
}