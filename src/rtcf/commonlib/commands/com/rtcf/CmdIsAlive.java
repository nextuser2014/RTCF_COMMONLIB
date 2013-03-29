package rtcf.commonlib.commands.com.rtcf;

import java.io.Serializable;

import rtcf.commonlib.commands.RtcfCommandMessage;
import rtcf.commonlib.enumeration.CssState;


/**
 * DSS System
 * BAS Component
 * CommandResult expected
 * 
 * @author agostinelli
 *
 */

public class CmdIsAlive extends RtcfCommandMessage implements Serializable {

	private static final long serialVersionUID = 3143263552109314992L;
	private String name;
	private CssState status;
	private Long progId;
	
	public CmdIsAlive(String name, CssState status, Long progId) { 
		super();
		this.name = name;
		this.status = status;
		this.progId = progId;
	}

	public CssState getStatus() {
		return status;
	}
	
	public String getName() {
		return name;
	}
	
	public Long getProgId() {
		return progId;
	}
}
