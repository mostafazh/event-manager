package eg.edu.guc.hci.server.model;

import java.sql.ResultSet;
import java.util.ArrayList;

public interface ModelFactory<L extends Model>{
   public L newModel(ResultSet rs);
   public L newModel(String s);

   public ArrayList<String> getColumnNames();
}