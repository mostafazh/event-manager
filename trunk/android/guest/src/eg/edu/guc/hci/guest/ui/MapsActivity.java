package eg.edu.guc.hci.guest.ui;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

import eg.edu.guc.hci.guest.ui.R;
import android.os.Bundle;

public class MapsActivity extends MapActivity {
	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maps);
		MapView mapView = (MapView) findViewById(R.id.mapview);
		mapView.setBuiltInZoomControls(true);
	}
}
