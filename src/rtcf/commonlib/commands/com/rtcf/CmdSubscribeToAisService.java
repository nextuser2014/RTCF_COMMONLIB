package rtcf.commonlib.commands.com.rtcf;

import java.io.Serializable;

import rtcf.commonlib.commands.RtcfCommandMessage;

public class CmdSubscribeToAisService extends RtcfCommandMessage implements Serializable {

	/**
	 * Subscribe to AIS service
	 * 
	 * expected result : CommandResult
	 * 
	 */
	
	
	private static final long serialVersionUID = 1520242132757023816L;

	private String temporaryQueue;
	private double longitudeCentre;		//rad
	private double latitudeCentre;		//rad
	private double range;				//m

	public CmdSubscribeToAisService(String temporaryQueue, double longitudeCentre, double latitudeCentre, double range) {
		super();
		this.temporaryQueue = temporaryQueue;
		this.longitudeCentre = longitudeCentre;	
		this.latitudeCentre = latitudeCentre;
    this.range = range;
	}

	public String getTemporaryQueue() {
		return temporaryQueue;
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
