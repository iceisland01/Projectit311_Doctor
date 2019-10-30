package model;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Opd_Card")
public class Opd_Card {
	
	@Id
	private String Opd_id;
	
	@Column(name="Opd_date")
	private Date Opd_date;
	
	@Column(name="initial_symptoms")
	private String initial_symptoms;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="uesr_id")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;
	
	@OneToMany(cascade = {CascadeType.ALL} , mappedBy = "pk.opd_card")
	private List<UserOpdcard> user_opd = new Vector<>();
	
	
	
	public Opd_Card() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Opd_Card(String opd_id, Date opd_date, String initial_symptoms, User user) {
		super();
		Opd_id = opd_id;
		Opd_date = opd_date;
		this.initial_symptoms = initial_symptoms;
		this.user = user;
	}







	public String getOpd_id() {
		return Opd_id;
	}



	public void setOpd_id(String opd_id) {
		Opd_id = opd_id;
	}



	public Date getOpd_date() {
		return Opd_date;
	}



	public void setOpd_date(Date opd_date) {
		Opd_date = opd_date;
	}



	public String getInitial_symptoms() {
		return initial_symptoms;
	}



	public void setInitial_symptoms(String initial_symptoms) {
		this.initial_symptoms = initial_symptoms;
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



	public List<UserOpdcard> getUser_opd() {
		return user_opd;
	}



	public void setUser_opd(List<UserOpdcard> user_opd) {
		this.user_opd = user_opd;
	}
	
	
	
	
	
	
	
	

}
