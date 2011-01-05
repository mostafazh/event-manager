package eg.edu.guc.hci.usher.ui;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class task1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.task1_view_usher);
	}
	
	

	public void comment(View v){
		startActivity(new Intent(this, CommentActivity.class));
	}
	
	public void submitTask(View v){
		Toast.makeText(task1Activity.this,"Task submited succesfully", Toast.LENGTH_SHORT/Toast.LENGTH_LONG).show();		
		
		Thread t = new Thread(new Runnable(){
			public void run() {
				try {
					Thread.sleep(15000);
					Log.i("Event Manager", "Notification");
					int icon = R.drawable.icon;        // icon from resources
					CharSequence tickerText = "A new task is assigned to you";              // ticker-text
					long when = System.currentTimeMillis();         // notification time
					Context context = getApplicationContext();      // application Context
					CharSequence contentTitle = "A new task was assigned to you";  // expanded message title
					CharSequence contentText = "Click to see the task.";      // expanded message text

					Intent notificationIntent = new Intent(getApplicationContext(), task1Activity.class);
					PendingIntent contentIntent = PendingIntent.getActivity(getApplicationContext(), 0, notificationIntent, 0);

					// the next two lines initialize the Notification, using the configurations above
					Notification notification = new Notification(icon, tickerText, when);
					notification.defaults |= Notification.DEFAULT_SOUND;
					notification.defaults |= Notification.DEFAULT_VIBRATE;
					notification.setLatestEventInfo(context, contentTitle, contentText, contentIntent);
					NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

					mNotificationManager.notify(1, notification);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		t.start();
		finish();
	}
}
