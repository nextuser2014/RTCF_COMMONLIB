package rtcf.commonlib.dto.rtcf;

import java.io.Serializable;
import java.sql.Time;

import rtcf.commonlib.enumeration.AISTrackStatus;
import rtcf.commonlib.enumeration.Nationality;


/**
 * RTCF Simulator (STUB)
 * 
 * @author cagostinelli
 *
 */

public class AisTrackRtcf implements Serializable {


	private static final long serialVersionUID = 1311881558838354961L;
	
	private AisKinematic kinematic;
	private String callSign;
	private String name;
	private Nationality nationality;
	private int type;
	private int aisNavigationStatus;
	private float aisRot;			//deg/sec
	private int aisShipLenght;		//m
	private int aisShipWidth;		//m
	private String aisTypeShipCargo;
	private String aisVersion;
	private int aisImoNumber;
	private int aisDraught;
	private String aisDestination;
	private Time aisEta;			//Secondi dal 1 gennaio 1970
	private AISTrackStatus trackStatus;
	private boolean valid;

	public AisTrackRtcf() {
		super();
	}

	public AisKinematic getKinematic() {
		return kinematic;
	}

	public void setKinematic(AisKinematic kinematic) {
		this.kinematic = kinematic;
	}

	public String getCallSign() {
		return callSign;
	}

	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Nationality getNationality() {
		return nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getAisNavigationStatus() {
		return aisNavigationStatus;
	}

	public void setAisNavigationStatus(int aisNavigationStatus) {
		this.aisNavigationStatus = aisNavigationStatus;
	}

	public float getAisRot() {
		return aisRot;
	}

	public void setAisRot(Float aisRot) {
		this.aisRot = aisRot;
	}

	public int getAisShipLenght() {
		return aisShipLenght;
	}

	public void setAisShipLenght(int aisShipLenght) {
		this.aisShipLenght = aisShipLenght;
	}

	public int getAisShipWidth() {
		return aisShipWidth;
	}

	public void setAisShipWidth(int aisShipWidth) {
		this.aisShipWidth = aisShipWidth;
	}

	public String getAisTypeShipCargo() {
		return aisTypeShipCargo;
	}

	public void setAisTypeShipCargo(String aisTypeShipCargo) {
		this.aisTypeShipCargo = aisTypeShipCargo;
	}

	public String getAisVersion() {
		return aisVersion;
	}

	public void setAisVersion(String aisVersion) {
		this.aisVersion = aisVersion;
	}

	public int getAisImoNumber() {
		return aisImoNumber;
	}

	public void setAisImoNumber(int aisImoNumber) {
		this.aisImoNumber = aisImoNumber;
	}

	public int getAisDraught() {
		return aisDraught;
	}

	public void setAisDraught(int aisDraught) {
		this.aisDraught = aisDraught;
	}

	public String getAisDestination() {
		return aisDestination;
	}

	public void setAisDestination(String aisDestination) {
		this.aisDestination = aisDestination;
	}

	public Time getAisEta() {
		return aisEta;
	}

	public void setAisEta(Time aisEta) {
		this.aisEta = aisEta;
	}

	public AISTrackStatus getTrackStatus() {
		return trackStatus;
	}

	public void setTrackStatus(AISTrackStatus trackStatus) {
		this.trackStatus = trackStatus;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
