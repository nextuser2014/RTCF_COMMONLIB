package rtcf.commonlib.enumeration;

import java.io.Serializable;

public enum AISTrackStatus implements Serializable{

	CREATE_UPDATE(0,"Create Update"),
	OUT_OF_RANGE(1,"Out of Range"),
	DELETE(2,"Delete");

	private AISTrackStatus(int value, String abbreviation) {
	   this.abbreviation = abbreviation;
	   this.int_value = value;
	}

	public String getAbbreviation() { return abbreviation; }
	public int getIntValue() { return int_value; }

	private String abbreviation;
	private int int_value;
 
}