package eg.edu.guc.hci.teamleader.ui.team;

import java.util.List;

import eg.edu.guc.hci.teamleader.server.model.User;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class TeamsAdapter extends ArrayAdapter<User> {

	private List<User> items;

	public TeamsAdapter(Context context, int textViewResourceId,
			List<User> items) {
		super(context, textViewResourceId, items);
		this.items = items;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {
			LayoutInflater vi = (LayoutInflater) getContext().getSystemService(
					Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(eg.edu.guc.hci.teamleader.ui.R.layout.team_member_item,
					null);
		}
		User o = items.get(position);
		if (o != null) {
			TextView member_name = (TextView) v
					.findViewById(eg.edu.guc.hci.teamleader.ui.R.id.teamMemberItemName);
			TextView member_position = (TextView) v
					.findViewById(eg.edu.guc.hci.teamleader.ui.R.id.teamMemberItemType);
			if (member_name != null) {
				member_name.setText(o.getName());
			}
			if (member_position != null) {
				if(o.getType_id()==1)
					member_position.setText("Leader");
				else
					member_position.setText("Usher");
			}
			ImageView im = (ImageView) v.findViewById(R.id.icon);
			if (im != null) {
				im.setImageDrawable(getContext().getResources().getDrawable(
						getContext().getResources().getIdentifier(
								"@drawable/" + o.getImage(), "drawable",
								getContext().getPackageName())));
			}
		}
		return v;
	}
}
