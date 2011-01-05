package eg.edu.guc.hci.usher.ui;




import java.io.IOException;

import android.app.ListActivity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class InboxActivity extends ListActivity {
    /** Called when the activity is first created. */
    
	static String msg1 = "Ahmed\nMeet me at B1";
	static String msg2 = "Mostafa\nNeed your help quickly";
	static String msg3 = "Ashry\n";
	
	
	
    static final String[] msgs = new String[] {msg1,msg2,msg3,msg1};
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	  super.onCreate(savedInstanceState);

    	  setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, msgs));
    	  
    	  ListView lv = getListView();
    	  lv.setTextFilterEnabled(true);
    	}
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) 
    {
    	if(position >= 2)
    	startActivity(new Intent(this, MessageActivity.class));
    	else
    	startActivity(new Intent(this, VoiceMessageActivity.class));	
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.layout.menu_messages, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
      
      case R.id.menu_messages_ctm:
    	  startActivity(new Intent(this, CreateTextMessage.class));
      break;
      
      case R.id.menu_messages_cvm:
      break;
      }
      return true;
    }
}
