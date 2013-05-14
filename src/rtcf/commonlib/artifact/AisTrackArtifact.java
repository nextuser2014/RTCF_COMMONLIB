package rtcf.commonlib.artifact;

import rtcf.commonlib.dto.rtcf.AisTrackRtcf;

public class AisTrackArtifact extends RtcfTopicArtifact {

	private static final long serialVersionUID = -6370522459711539692L;
	
	private AisTrackRtcf aisTrack;

  public AisTrackArtifact () {
		super(0);
	}

	//CTOR
	public AisTrackArtifact (int id, AisTrackRtcf aisTrack) {
		super(id);
		this.aisTrack = aisTrack;
	}

	public AisTrackRtcf getAisTrack() {
		return aisTrack;
	}

  public void setAisTrack(AisTrackRtcf aisTrack) {
		this.aisTrack = aisTrack;
	}

}
