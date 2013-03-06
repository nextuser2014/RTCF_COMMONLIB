package rtcf.commonlib.result;

import java.io.Serializable;

import rtcf.commonlib.enumeration.ErrorCode;


public class RtcfCommandResult implements Serializable{

		private static final long serialVersionUID = 3702463435705219720L;
		private ErrorCode result; // 0:OK   !=0:not ok
	    private long commandId; // identificativo univoco del comando

	    public RtcfCommandResult() {
	        result = ErrorCode.EXECUTED;
	    }

	    @Override
	    public String toString() {
	        String s = "";
	        s += "\n\n************************";
	        s += "\nCommand Id             = " + this.commandId;
	        s += "\nresult                 = " + this.result.getAbbreviation();
	        s += "\n************************\n\n";
	        return s;
	    }


	    public long getCommandId() {
			return commandId;
		}

		public void setCommandId(long commandId) {
			this.commandId = commandId;
		}

		public boolean isError() {
	        return !result.equals(ErrorCode.EXECUTED);
	    }

	    public boolean isNoError() {
	        return result.equals(ErrorCode.EXECUTED);
	    }

	    public ErrorCode getResult() {
	        return result;
	    }

	    public void setResult(ErrorCode result) {
	        this.result = result;
	    }


	    public RtcfCommandResult(int cmd) {
	        this();
	        commandId = cmd;
	    }
}
