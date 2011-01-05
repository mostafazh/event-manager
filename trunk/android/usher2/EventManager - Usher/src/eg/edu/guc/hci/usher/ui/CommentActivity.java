package eg.edu.guc.hci.usher.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CommentActivity extends Activity {

	static String msg1 = "Leader\nwhat the r u doing?";
	static String msg2 = "Me\ni'm doing what the task says.";
	static String msg3 = "Leader\nno, u r doing it worng. please read the task again.";
	static String msg4 = "Me\nah, okay now i got it.";

	static final String[] msgs = new String[] { msg1, msg2, msg3, msg4 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.comment_view);
		
		((ListView)findViewById(R.id.comment_view_list)).setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, msgs));
	}
}
