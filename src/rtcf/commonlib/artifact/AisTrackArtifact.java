package rtcf.commonlib.artifact;


import rtcf.commonlib.dto.rtcf.AisTrackRtcf;

public class AisTrackArtifact extends RtcfTopicArtifact {

	private static final long serialVersionUID = -2914140224440614660L;
	private AisTrackRtcf aisTrack;

	//CTOR
	public AisTrackArtifact (int id, AisTrackRtcf aisTrack) {
		super(id);
		this.aisTrack = aisTrack;
	}

	public AisTrackRtcf getAisTracks() {
		return aisTrack;
	}
	
}
