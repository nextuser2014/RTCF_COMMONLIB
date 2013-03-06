package rtcf.commonlib.dto.rtcf;

import java.io.Serializable;

import rtcf.commonlib.enumeration.WeatherCode;


public class MeteoData implements Serializable{

	private static final long serialVersionUID = 1505288900220589383L;
	private Float tempC;				//Celsius
	private Float tempF;				//Farenheit
	private Float windSpeed;			//m/s
	private Float windDirection;		//Rad
	private WeatherCode weatherCode;
	private Float precipMm;				//Mm
	private Float humidity;				//%
	private Float pressure;				//mB
	private Float cloudCover;			//%
	private Float swellHeight;			//M
	private Float swellDir;				//Rad
	private Float swellPeriod;			//sec
	private Float waterTempC;			//Celsius
	
	public MeteoData() {
		super();			
	}

	public Float getTempC() {
		return tempC;
	}

	public void setTempC(Float tempC) {
		this.tempC = tempC;
	}

	public Float getTempF() {
		return tempF;
	}

	public void setTempF(Float tempF) {
		this.tempF = tempF;
	}

	public Float getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Float windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Float getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(Float windDirection) {
		this.windDirection = windDirection;
	}

	public WeatherCode getWeatherCode() {
		return weatherCode;
	}

	public void setWeatherCode(WeatherCode weatherCode) {
		this.weatherCode = weatherCode;
	}

	public Float getPrecipMm() {
		return precipMm;
	}

	public void setPrecipMm(Float precipMm) {
		this.precipMm = precipMm;
	}

	public Float getHumidity() {
		return humidity;
	}

	public void setHumidity(Float humidity) {
		this.humidity = humidity;
	}

	public Float getPressure() {
		return pressure;
	}

	public void setPressure(Float pressure) {
		this.pressure = pressure;
	}

	public Float getCloudCover() {
		return cloudCover;
	}

	public void setCloudCover(Float cloudCover) {
		this.cloudCover = cloudCover;
	}

	public Float getSwellHeight() {
		return swellHeight;
	}

	public void setSwellHeight(Float swellHeight) {
		this.swellHeight = swellHeight;
	}

	public Float getSwellDir() {
		return swellDir;
	}

	public void setSwellDir(Float swellDir) {
		this.swellDir = swellDir;
	}

	public Float getSwellPeriod() {
		return swellPeriod;
	}

	public void setSwellPeriod(Float swellPeriod) {
		this.swellPeriod = swellPeriod;
	}

	public Float getWaterTempC() {
		return waterTempC;
	}

	public void setWaterTempC(Float waterTempC) {
		this.waterTempC = waterTempC;
	}
	
	
}
