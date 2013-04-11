package rtcf.commonlib.result;

import java.util.ArrayList;

import rtcf.commonlib.dto.rtcf.MeteoDataSet;

/**
 * 
 * @author agostinelli
 *
 */

public class CommandResultMetocReply extends RtcfCommandResult {

	private static final long serialVersionUID = 8935364129193202317L;
	
	private ArrayList<MeteoDataSet> datasetMeteo;

	public CommandResultMetocReply(){
		super();
	}
	
	public ArrayList<MeteoDataSet> getDatasetMeteo() {
		return datasetMeteo;
	}

	public void setDatasetMeteo(ArrayList<MeteoDataSet> datasetMeteo) {
		this.datasetMeteo = datasetMeteo;
	}
	
}
