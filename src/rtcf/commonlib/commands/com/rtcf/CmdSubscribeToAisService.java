package rtcf.commonlib.commands.com.rtcf;

import java.io.Serializable;

import rtcf.commonlib.commands.RtcfCommandMessage;

/**
 * Subscribe to AIS service
 * 
 * expected result : RtcfCommandResult
 * 
 */
public class CmdSubscribeToAisService extends RtcfCommandMessage implements Serializable {

	private static final long serialVersionUID = -8836146183764123370L;

	private String temporaryTopic;
	private double longitudeCentre;		//rad
	private double latitudeCentre;		//rad
	private double range;				//m

	public CmdSubscribeToAisService(String temporaryTopic, double longitudeCentre, double latitudeCentre, double range) {
		super();
		this.temporaryTopic = temporaryTopic;		
		this.longitudeCentre = longitudeCentre;	
		this.latitudeCentre = latitudeCentre;
		this.range = range;
	}

	public String getTemporaryTopic() {
		return temporaryTopic;
	}
	
	public double getLongitudeCentre() {
		return longitudeCentre;
	}

	public double getLatitudeCentre() {
		return latitudeCentre;
	}

	public double getRange() {
		return range;
	}
	
}
