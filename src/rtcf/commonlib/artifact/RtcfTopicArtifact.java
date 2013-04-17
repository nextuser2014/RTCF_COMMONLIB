package rtcf.commonlib.artifact;

import java.io.Serializable;
import java.util.GregorianCalendar;

public abstract class RtcfTopicArtifact implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5766244936916707578L;
	private long id;
	private String title; 
	private String destination;
	
	public GregorianCalendar date;

	public RtcfTopicArtifact(int id) {
		super();
		this.id = id;
		this.date = new GregorianCalendar();
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "TopicArtifact [id=" + id + ", title=[" + title
				+ "], destination=[" + destination + "], date=[" 
				+ date.get(GregorianCalendar.DAY_OF_MONTH) + "-"
				+ (date.get(GregorianCalendar.MONTH)+1) + "-"
				+ date.get(GregorianCalendar.YEAR) + " "
				+ date.get(GregorianCalendar.HOUR) + ":"
				+ date.get(GregorianCalendar.MINUTE) + ":"
				+ date.get(GregorianCalendar.SECOND) + "]";
	}
	
	
}
