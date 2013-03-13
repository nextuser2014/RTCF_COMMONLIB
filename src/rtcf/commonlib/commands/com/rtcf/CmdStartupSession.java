package rtcf.commonlib.commands.com.rtcf;

import java.io.Serializable;

import rtcf.commonlib.commands.RtcfCommandMessage;

/**

 * CommandResult expected: RtcfCommandResultSession
 * 
 * @author agostinelli
 *
 */
public class CmdStartupSession extends RtcfCommandMessage implements Serializable {

	private static final long serialVersionUID = -1582054800484957780L;
	
	public CmdStartupSession() { 
		super();
	}
	
}
