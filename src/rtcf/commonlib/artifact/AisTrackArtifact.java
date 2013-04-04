package rtcf.commonlib.artifact;

import rtcf.commonlib.dto.rtcf.AisTrackRtcf;

public class AisTrackArtifact extends RtcfTopicArtifact {

	private static final long serialVersionUID = -7757139057282660046L;
	private AisTrackRtcf aisTrack;

	//CTOR
	public AisTrackArtifact (int id, AisTrackRtcf aisTrack, long time) {
		super(id, time);
		this.aisTrack = aisTrack;
	}

	public AisTrackRtcf getAisTracks() {
		return aisTrack;
	}
	
}
