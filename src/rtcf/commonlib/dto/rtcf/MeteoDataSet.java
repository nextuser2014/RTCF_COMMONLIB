package rtcf.commonlib.dto.rtcf;

import java.io.Serializable;
import java.util.ArrayList;

public class MeteoDataSet implements Serializable {

    private static final long serialVersionUID = 3840328757613978945L;
    private Double latitudeCentre;		   //rad
    private Double longitudeCentre;		   //rad
    private MeteoData currentData;
    private ArrayList<MeteoData> historyData;
    private ArrayList<MeteoData> forecastData;
    private Long currentTime;                  //Secondi dal 1 gennaio 1970

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

    public Long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
    }
}
