package eg.edu.guc.hci.teamleader.ui.task;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import eg.edu.guc.hci.teamleader.model.AllTasks;
import eg.edu.guc.hci.teamleader.model.TaskManager;
import eg.edu.guc.hci.teamleader.model.TeamManager;
import eg.edu.guc.hci.teamleader.server.model.Task;
import eg.edu.guc.hci.teamleader.server.model.User;
import eg.edu.guc.hci.teamleader.ui.R;

public class TaskView extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.task_view);
		User temp = new User(); temp.setName("ashry");
		List<Task> list;
		try {
			//list = new TaskManager(temp).getTasks();
			list = (new AllTasks().getTasks());
			Task tm = list.get(getIntent().getIntExtra("position", 0));
			
			((TextView) findViewById(R.id.view_task_title)).setText(tm.getTitle());
			((TextView) findViewById(R.id.view_task_priorty)).setText(tm.getPriority()+"");
			((TextView) findViewById(R.id.view_task_description)).setText(tm.getDescription());
			((TextView) findViewById(R.id.view_task_deadline)).setText(tm.getDeadline().toLocaleString());
			((TextView) findViewById(R.id.view_task_priorty)).setText(tm.getPriority()+"");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void createTask(View v){
		finish();
	}
}
