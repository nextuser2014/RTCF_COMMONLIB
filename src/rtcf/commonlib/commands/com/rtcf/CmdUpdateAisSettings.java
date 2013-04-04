package rtcf.commonlib.commands.com.rtcf;

import java.io.Serializable;

import rtcf.commonlib.commands.RtcfCommandMessage;

public class CmdUpdateAisSettings extends RtcfCommandMessage implements Serializable {

	private static final long serialVersionUID = -2183324887390379235L;
	/**
	 * Update parameters of the requested AIS service
	 * 
	 * expected result : CommandResult
	 * 
	 */

	private double longitudeCentre;		//rad
	private double latitudeCentre;		//rad
	private double range;				//m
	
	public CmdUpdateAisSettings(double longitudeCentre, double latitudeCentre, double range) {
		super();
		this.longitudeCentre = longitudeCentre;
		this.latitudeCentre = latitudeCentre;
		this.range = range;
	}

	public final double getLongitudeCentre() {
		return longitudeCentre;
	}

	public final double getLatitudeCentre() {
		return latitudeCentre;
	}

	public final double getRange() {
		return range;
	}

	
	
}
