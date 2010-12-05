package eg.edu.guc.hci.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.commonsware.cwac.merge.MergeAdapter;

import android.app.Activity;
import android.app.ListActivity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class VotesActivity extends ListActivity {

	private static final String[] openVotes = { "Favourite song",
			"Favourite place", "Best Performer" };
	private static final String[] closedVotes = { "Vote 1" };
	private MergeAdapter adapter = null;
	private ArrayAdapter<String> arrayAdapter = null;

	private AdapterView.OnItemClickListener mOnClickListener = new AdapterView.OnItemClickListener() {
		public void onItemClick(AdapterView parent, View v, int position,
				long id) {
			onListItemClick((ListView) parent, v, position, id);
		}
	};

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
				android.R.layout.simple_list_item_1, new ArrayList<String>(
						Arrays.asList(openVotes))));
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
		ArrayList<String> list = new ArrayList<String>(
				Arrays.asList(closedVotes));

		Collections.shuffle(list);

		return (new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, list));
	}

	protected void onListItemClick(ListView l, View v, int position, long id) {
		Log.i("Event Manager", "Click");
	}
}
