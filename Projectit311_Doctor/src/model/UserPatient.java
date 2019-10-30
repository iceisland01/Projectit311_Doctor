package model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="Appointment")
public class UserPatient {
	@EmbeddedId
	private UserPatientID pk = new UserPatientID();
	
	@Column(name="app_date")
	private Date app_date;
	
	@Column(name="cause")
	private String cause ;
	
	@Column(name="time")
	private String time;

	public UserPatient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPatient(UserPatientID pk, Date app_date, String cause, String time) {
		super();
		this.pk = pk;
		this.app_date = app_date;
		this.cause = cause;
		this.time = time;
	}

	public UserPatientID getPk() {
		return pk;
	}

	public void setPk(UserPatientID pk) {
		this.pk = pk;
	}

	public Date getApp_date() {
		return app_date;
	}

	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	
	
	

}
