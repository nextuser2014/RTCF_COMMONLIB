package rtcf.commonlib.result;

import rtcf.commonlib.enumeration.CssState;

/**
 * 
 * @author agostinelli
 *
 */

public class CommandResultRtcfStatus extends RtcfCommandResult {

	private static final long serialVersionUID = 5621119858933378078L;
	private CssState status;
	private Long progId;
	
    public CssState getStatus() {
        return status;
    }

    public void setStatus(CssState status) {
        this.status = status;
    }
    
    public Long getProgId() {
        return progId;
    }

    public void setProgId(Long progId) {
        this.progId = progId;
    }
}
