package rtcf.commonlib.commands.com.rtcf;

import java.io.Serializable;

import rtcf.commonlib.commands.RtcfCommandMessage;

/**
 * Update the settings of AIS services request. 
 * 
 * expected result : RtcfCommandResult
 * 
 */
public class CmdUpdateAisSettings extends RtcfCommandMessage implements Serializable  {

	private static final long serialVersionUID = 2730979544661884061L;
	private double longitudeCentre;		//rad
	private double latitudeCentre;		//rad
	private double range;				//m

	public CmdUpdateAisSettings(double longitudeCentre, double latitudeCentre, double range) {
		super();
		
		this.longitudeCentre = longitudeCentre;	
		this.latitudeCentre = latitudeCentre;	
		this.range = range;
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
