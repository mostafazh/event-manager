package eg.edu.guc.hci.usher.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class CreateTextMessage extends Activity
{
	static String [] names = new String [] {"Ahmed","Mostafa","Zaher","Ashry"};
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_text_message);
	
		AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.EditText01);
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.name_list_item, names);
	    textView.setAdapter(adapter);
	}
	public void SendMessage(View v)
	{
		finish();
		Toast.makeText(this, "Message Sent Successfully", Toast.LENGTH_SHORT).show();
	}
}
