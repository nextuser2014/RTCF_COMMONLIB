package rtcf.commonlib.commands.com.rtcf;

import java.io.Serializable;
import java.sql.Time;

import rtcf.commonlib.commands.RtcfCommandMessage;

/**
 * DSS System
 * BAS Component
 * CommandResult expected
 * 
 * @author agostinelli
 *
 */
public class CmdMetocRequest extends RtcfCommandMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3672389129323825816L;
	private Double latitudeCentre;		//rad
	private Double longitudeCentre;		//rad
	private Double range;				//m
	private Long requestTime;			//Secondi dal 1 gennaio 1970
	private Integer history;			//H
	private Integer forecast;			//H
	
	public CmdMetocRequest(Double latitudeCentre, Double longitudeCentre, Double range, Long requestTime, Integer history, Integer forecast) {
		super();
		this.latitudeCentre = latitudeCentre; 	
		this.longitudeCentre = longitudeCentre; 
		this.range = range;					
		this.requestTime = requestTime;			
		this.history = history;					
		this.forecast = forecast;				
	}

	public Double getLatitudeCentre() {
		return latitudeCentre;
	}
	
	public Double getLongitudeCentre() {
		return longitudeCentre;
	}
	
	public Double getRange() {
		return range;
	}
	
	public Long getRequestTime() {
		return requestTime;
	}
	
	public Integer getHistory() {
		return history;
	}
	
	public Integer getForecast() {
		return forecast;
	}
}
