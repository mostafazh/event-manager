package eg.edu.guc.hci.server.model;

import java.io.StringWriter;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class Model {
	public String toXML(){
		Serializer serializer = new Persister();
		StringWriter sw = new StringWriter();
		try {
			serializer.write(this, sw);
			return sw.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
}
