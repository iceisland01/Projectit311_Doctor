package model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Embeddable
public class UserPatientID implements Serializable {
	@ManyToOne(fetch=FetchType.LAZY)
	private User user;
	
	@ManyToOne
	private Patient  patient ;

	public UserPatientID() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPatientID(User user, Patient patient) {
		super();
		this.user = user;
		this.patient = patient;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	
	
	

}
