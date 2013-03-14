package rtcf.commonlib.artifact;

import java.io.Serializable;
import java.util.GregorianCalendar;

public abstract class RtcfTopicArtifact implements Serializable  {

	private static final long serialVersionUID = 6767848569646922284L;
	private long id;
	private String title; 
	private String destination;
	
	//date seconds since 01-01-1970
	private long date;
	
	public RtcfTopicArtifact(int id) {
		super();
		this.id = id;
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

	/**
	 * 
	 * @param date seconds since 01-01-1970
	 */
	public final long getDate() {
		return date;
	}

	/**
	 * 
	 * @param date seconds since 01-01-1970
	 */
	public final void setDate(long date) {
		this.date = date;
	}
	
}
