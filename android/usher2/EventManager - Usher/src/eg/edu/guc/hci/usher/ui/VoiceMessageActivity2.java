package eg.edu.guc.hci.usher.ui;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class VoiceMessageActivity2 extends Activity
{
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.message_listen);
	}
	public void play(View v)
	{
		Context context = getBaseContext();
    	MediaPlayer mp = MediaPlayer.create(context, R.raw.seeyoulater);
    	mp.start();
	}
}
