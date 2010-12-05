package eg.edu.guc.hci.usher.ui;




import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class InboxActivity extends ListActivity {
    /** Called when the activity is first created. */
    
	static String msg1 = "Ahmed\nMeet me at B1";
	static String msg2 = "Mostafa\nNeed your help quickly";
	static String msg3 = "Ashry\n";
	
	
	
    static final String[] msgs = new String[] {msg1,msg2,msg3,msg1,msg2,msg3,msg1,msg2,msg3,msg1,msg2,msg3};
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	  super.onCreate(savedInstanceState);

    	  setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, msgs));

    	  ListView lv = getListView();
    	  lv.setTextFilterEnabled(true);
    	}
}
