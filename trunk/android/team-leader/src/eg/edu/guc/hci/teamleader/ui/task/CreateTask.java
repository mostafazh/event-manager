package eg.edu.guc.hci.teamleader.ui.task;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import eg.edu.guc.hci.teamleader.model.TaskManager;
import eg.edu.guc.hci.teamleader.model.TeamManager;
import eg.edu.guc.hci.teamleader.server.model.Task;
import eg.edu.guc.hci.teamleader.server.model.User;
import eg.edu.guc.hci.teamleader.ui.R;
import eg.edu.guc.hci.teamleader.ui.users.UsersActivity;

public class CreateTask extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_task);			
	}
	
	public void createTask(View v){
		finish();
	}
	
	public void assign(View v){
		startActivity(new Intent(this, UsersActivity.class));
	}
}
