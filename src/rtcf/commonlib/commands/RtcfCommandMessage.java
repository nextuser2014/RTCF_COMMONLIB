package rtcf.commonlib.commands;

import java.io.Serializable;

import javax.jms.Destination;


public abstract class RtcfCommandMessage implements Serializable {

	
	private Destination destination;
	private String clientId;
	
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	
}
