package eg.edu.guc.hci.server.model;


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class Message extends Model {
	// Actual names of the columns in the DB.
	public static final String message_id_column = "message_id";
	public static final String title_column = "title";
	public static final String type_column = "type";
	public static final String text_column = "text";
	public static final String voice_column = "voice";

	@Attribute
	private int message_id;
	@Attribute
	private String title;
	@Attribute
	private int type;
	@Attribute
	private String text;
	@Attribute
	private String voice;
	
	public Message() {
	}
	
	public Message(int message_id, String title, int type, String text,
			String voice) {
		super();
		this.message_id = message_id;
		this.title = title;
		this.type = type;
		this.text = text;
		this.voice = voice;
	}

	public int getMessage_id() {
		return message_id;
	}

	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}
	
	

}