package rtcf.commonlib.artifact;

import java.util.ArrayList;

import rtcf.commonlib.dto.rtcf.AisTrackRtcf;

public class AisTrackArtifact extends RtcfTopicArtifact {

	private static final long serialVersionUID = -5609391972011734619L;
	private ArrayList<AisTrackRtcf> aisTrack;

	//CTOR
	public AisTrackArtifact (int id, ArrayList<AisTrackRtcf> aisTrack) {
		super(id);
		this.aisTrack = aisTrack;
	}

	public ArrayList<AisTrackRtcf> getAisTracks() {
		return aisTrack;
	}
	
}
