package rtcf.commonlib.artifact;

import java.io.Serializable;

public abstract class RtcfTopicArtifact implements Serializable  {

	private static final long serialVersionUID = 4013183801767518821L;
	private long id;
	private String title; 
	private String destination;
	public long date;
	
	public RtcfTopicArtifact(int id, long date) {
		super();
		this.id = id;
		this.date = date;
	}

	public long getDate() {
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
				+ "], destination=[" + destination + "]";
	}
	
	
}
