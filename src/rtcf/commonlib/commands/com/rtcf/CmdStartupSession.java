package rtcf.commonlib.commands.com.rtcf;

import java.io.Serializable;
import javax.jms.Destination;

import rtcf.commonlib.commands.RtcfCommandMessage;

/**
 * DSS System
 * BAS Component
 * CommandResult expected: CommandResultSession
 * 
 * @author agostinelli
 *
 */
public class CmdStartupSession extends RtcfCommandMessage implements Serializable {

	private static final long serialVersionUID = 754106411247310880L;
	
	public CmdStartupSession() { 
		super();
	}

	
}
