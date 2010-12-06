package eg.edu.guc.hci.usher.ui.team;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
 
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
 
public class TeamsActivity extends ListActivity {
 
    private CountryAdapter countryAdapter;
    private static final CountryDataManager countryDataManager
    = new CountryDataManager();
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        this.countryAdapter = new CountryAdapter(this, R.layout.row,
                new ArrayList<CountryItem>());
        setListAdapter(this.countryAdapter);
 
        List<CountryItem> countryList = countryDataManager.getCountries();
 
        for(CountryItem country : countryList) {
            countryAdapter.notifyDataSetChanged();
            countryAdapter.add(country);
        }
        countryAdapter.notifyDataSetChanged();
 
        getListView().setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) {
                Toast.makeText(getApplicationContext(),
                    ((TextView)((LinearLayout) view).getChildAt(1)).getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
 
    }
 
}
