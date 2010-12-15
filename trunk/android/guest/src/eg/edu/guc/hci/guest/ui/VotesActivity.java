package eg.edu.guc.hci.guest.ui;

import java.util.ArrayList;
import java.util.Collections;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.commonsware.cwac.merge.MergeAdapter;

import eg.edu.guc.hci.guest.model.Votes;

public class VotesActivity extends ListActivity {
	private MergeAdapter adapter = null;
	private ArrayAdapter<String> arrayAdapter = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.votes);

		adapter = new MergeAdapter();
		arrayAdapter = buildFirstList();
		adapter.addView(buildLabel("Open Votes"));
		adapter.addAdapter(arrayAdapter);
		adapter.addView(buildLabel("Closed Votes"));
		adapter.addAdapter(buildSecondList());

		setListAdapter(adapter);
	}

	private ArrayAdapter<String> buildFirstList() {
		return (new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, new Votes().getOpenVotesTitles()));
	}

	private View buildLabel(String labelText) {
		TextView result = new TextView(this);
		result.setBackgroundColor(Color.GRAY);
		result.setTextColor(Color.BLACK);
		result.setTextSize(20);
		result.setTypeface(Typeface.create("", Typeface.BOLD));
		result.setText(" " + labelText);
		result.setHeight(40);
		return (result);
	}

	private ListAdapter buildSecondList() {
		ArrayList<String> list = new Votes().getClosedVotesTitles();

		Collections.shuffle(list);

		return (new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, list));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		startActivity(new Intent(this, VoteActivity.class).putExtra("id",
				getIdfromPosition(position)));

		Log.i("Event Manager", "Click, position=[" + position + "] id=["
				+ getIdfromPosition(position) + "]");
	}

	private int getIdfromPosition(int position) {
		return position - (position <= new Votes().getOpenVotes().size()? 1 : 2);
	}
}