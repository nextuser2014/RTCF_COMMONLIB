package rtcf.commonlib.artifact;

import rtcf.commonlib.dto.rtcf.AisTrackRtcf;

public class AisTrackArtifact extends RtcfTopicArtifact {

	private static final long serialVersionUID = 1359150726509831378L;
	
	private AisTrackRtcf aisTrack;

  public AisTrackArtifact () {
		super(0);
	}

	//CTOR
	public AisTrackArtifact (int id, AisTrackRtcf aisTrack) {
		super(id);
		this.aisTrack = aisTrack;
	}

	public AisTrackRtcf getAisTracks() {
		return aisTrack;
	}
	
}