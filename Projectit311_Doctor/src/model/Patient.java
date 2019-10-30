package model;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
	@Id
	private String patient_id;
	
	@Column(name="patient_name")
	private String patient_name;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="blood")
	private String blood;
	
	@Column(name="brithday")
	private Date brithday;
	
	@Column(name="address")
	private String address;
	
	@Column(name="tel")
	private String tel;
	
	@Column(name="drugallergy")
	private String drugallergy;
	
	@Column(name="disease")
	private String disease;
	
	@OneToMany(cascade = {CascadeType.ALL} , mappedBy = "pk.patient")
	private List<UserPatient> doc_pat = new Vector<>();
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String patient_id, String patient_name, String sex, String blood, Date brithday, String address,
			String tel, String drugallergy, String disease) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.sex = sex;
		this.blood = blood;
		this.brithday = brithday;
		this.address = address;
		this.tel = tel;
		this.drugallergy = drugallergy;
		this.disease = disease;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public Date getBrithday() {
		return brithday;
	}

	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDrugallergy() {
		return drugallergy;
	}

	public void setDrugallergy(String drugallergy) {
		this.drugallergy = drugallergy;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public List<UserPatient> getDoc_pat() {
		return doc_pat;
	}

	public void setDoc_pat(List<UserPatient> doc_pat) {
		this.doc_pat = doc_pat;
	}
	
	
	
	

}
