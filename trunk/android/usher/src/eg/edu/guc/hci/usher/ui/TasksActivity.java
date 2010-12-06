package eg.edu.guc.hci.usher.ui;




import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class TasksActivity extends ListActivity {
    /** Called when the activity is first created. */
    
	static String msg1 = "Task1\nTask1 description";
	static String msg2 = "Task2\nTask1 description";
	static String msg3 = "Task3\nTask1 description";
	static String msg4 = "Task4\nTask1 description";
	
	
	
    static final String[] msgs = new String[] {msg1,msg2,msg3,msg1};
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	  super.onCreate(savedInstanceState);

    	  setListAdapter(new ArrayAdapter<String>(this, R.layout.tasks_view_list , msgs));

    	  ListView lv = getListView();
    	  lv.setTextFilterEnabled(true);
    	}
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) 
    {
//    	startActivity(new Intent(this, Task1Activity.class));
    }
    
}
