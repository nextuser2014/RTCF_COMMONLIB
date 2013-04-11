package rtcf.commonlib.dto.rtcf;

/**
 * RTCF Simulator (STUB)
 * 
 * @author cagostinelli
 *
 */

public class AisKinematic implements java.io.Serializable {

	private static final long serialVersionUID = 4311584243064998605L;

	private Float latitude;			//grad
	private Float longitude;		//grad
	private Float course;			//rad
	private Float speed;			//m/s
	private int tq;					//6 se PAC = 1; 2 se PAC = 0
	private Long validityTime;		//Sec dal 1 Gennaio 1970
	
	public AisKinematic() {
		super();
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public Float getCourse() {
		return course;
	}

	public void setCourse(Float course) {
		this.course = course;
	}

	public Float getSpeed() {
		return speed;
	}

	public void setSpeed(Float speed) {
		this.speed = speed;
	}

	public int getTq() {
		return tq;
	}

	public void setTq(int tq) {
		this.tq = tq;
	}

	public Long getValidityTime() {
		return validityTime;
	}

	public void setValidityTime(Long validityTime) {
		this.validityTime = validityTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
