package clannotifier.cns;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: DAOUser
 *
 */
@Entity
public class DAOUser implements Serializable {
	@Id
  	@GeneratedValue(strategy = GenerationType.IDENTITY)
  	private int id;
	
	private static final long serialVersionUID = 1L;
	private String gameName;
	private	String realName;
	private String emailAddress;
	private String mobilePhone;
	private String carrier;
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
}