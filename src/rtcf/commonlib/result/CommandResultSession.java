package rtcf.commonlib.result;

public class CommandResultSession extends RtcfCommandResult {

	private static final long serialVersionUID = 4181924129020463096L;
	
	private String temporaryChannel;

	public CommandResultSession(){
		super();
	}

	public String getTemporaryChannel() {
		return temporaryChannel;
	}

	public void setTemporaryChannel(String temporaryChannel) {
		this.temporaryChannel = temporaryChannel;
	}
	
}
