package eg.edu.guc.hci.teamleader.ui.task;

import java.util.List;

import eg.edu.guc.hci.teamleader.server.model.Task;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

class TasksAdapter extends ArrayAdapter<Task> {

	private List<Task> items;

	public TasksAdapter(Context context, int textViewResourceId,
			List<Task> items) {
		super(context, textViewResourceId, items);
		this.items = items;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {
			LayoutInflater vi = (LayoutInflater) getContext().getSystemService(
					Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(eg.edu.guc.hci.teamleader.ui.R.layout.task_item,
					null);
		}
		Task o = items.get(position);
		if (o != null) {
			TextView task_title = (TextView) v
					.findViewById(eg.edu.guc.hci.teamleader.ui.R.id.taskItemName);
			TextView task_deadline = (TextView) v
					.findViewById(eg.edu.guc.hci.teamleader.ui.R.id.taskItemDeadline);
			if (task_title != null) {
				task_title.setText(o.getTitle());
			}
			if (task_deadline != null) {
				task_deadline.setText(o.getDeadline().toString());
			}
		}
		return v;
	}
}
