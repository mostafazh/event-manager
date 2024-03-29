package eg.edu.guc.hci.teamleader.ui.task;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import eg.edu.guc.hci.teamleader.model.AllTasks;
import eg.edu.guc.hci.teamleader.model.TaskManager;
import eg.edu.guc.hci.teamleader.server.model.Task;
import eg.edu.guc.hci.teamleader.server.model.User;
import eg.edu.guc.hci.teamleader.ui.R;

public class TasksActivity extends ListActivity implements OnItemClickListener {

	private TasksAdapter TasksAdapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		this.TasksAdapter = new TasksAdapter(this, R.layout.task_item,
				new ArrayList<Task>());
		setListAdapter(this.TasksAdapter);
		
		User temp = new User(); temp.setName("ashry");
		List<Task> tasksList;
		try {
			//tasksList = new TaskManager(temp).getTasks();
			tasksList = (new AllTasks().getTasks());
			for (Task task : tasksList) {
				TasksAdapter.notifyDataSetChanged();
				TasksAdapter.add(task);
			}
			TasksAdapter.notifyDataSetChanged();

			getListView().setOnItemClickListener(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}

	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		startActivity(new Intent(this, TaskView.class).putExtra(
				"position", arg2));
	}
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_option, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      startActivity(new Intent(this, CreateTask.class));
      return true;
    }
	
}
