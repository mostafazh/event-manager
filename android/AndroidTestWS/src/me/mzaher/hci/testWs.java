package me.mzaher.hci;

import me.mzaher.hci.ws.UserResource;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class testWs extends Activity {

	EditText usernameEditText;
	EditText passwordEditText;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		usernameEditText = (EditText) findViewById(R.id.EditText01);
		passwordEditText = (EditText) findViewById(R.id.EditText02);
	}
	
	public void login(View v) {
		Thread t = new Thread(new Runnable() {
			public void run() {
				Log.i("HCI", "Start");
				try {
					if (new UserResource().login(usernameEditText.getText()
							.toString(), passwordEditText.getText().toString()))
						startActivity(new Intent(getApplicationContext(),
								profile.class));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Log.i("HCI", "End");
			}
		});
		t.start();
	}
}