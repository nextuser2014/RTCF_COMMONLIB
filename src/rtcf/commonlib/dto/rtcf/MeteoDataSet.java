package rtcf.commonlib.dto.rtcf;

import java.io.Serializable;
import java.util.ArrayList;

public class MeteoDataSet implements Serializable {

	private static final long serialVersionUID = -3960504984838111465L;
	
	private Double latitudeCentre;		//rad
	private Double longitudeCentre;		//rad
	private MeteoData currentData;
	private ArrayList<MeteoData> historyData;
	private ArrayList<MeteoData> forecastData;
	
	public MeteoDataSet() { 
		super();				
	}
	
	public Double getLatitudeCentre() {
		return latitudeCentre;
	}
	
	public void setLatitudeCentre(Double latitudeCentre) {
		this.latitudeCentre = latitudeCentre;
	}
	
	public Double getLongitudeCentre() {
		return longitudeCentre;
	}
	
	public void setLongitudeCentre(Double longitudeCentre) {
		this.longitudeCentre = longitudeCentre;
	}
	
	public MeteoData getCurrentData() {
		return currentData;
	}
	
	public void setCurrentData(MeteoData currentData) {
		this.currentData = currentData;
	}
	
	public ArrayList<MeteoData> getHistoryData() {
		return historyData;
	}
	
	public void setHistoryData(ArrayList<MeteoData> historyData) {
		this.historyData = historyData;
	}
	
	public ArrayList<MeteoData> getForecastData() {
		return forecastData;
	}
	
	public void setForecastData(ArrayList<MeteoData> forecastData) {
		this.forecastData = forecastData;
	}
	
	
}
