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
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	private String uesr_id;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="user_sex")
	private String user_sex;
	
	@Column(name="idcard")
	private String idcard;
	
	@Column(name="birthday")
	private Date birthday;
	
	@Column(name="tel")
	private String tel;
	
	@Column(name="address")
	private String address;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="type_id")
	private TypeUser typeuser ;
	
	@OneToMany(cascade = {CascadeType.ALL} , mappedBy = "pk.user")
	private List<UserPatient> doc_pat = new Vector<>();
	
	@OneToMany(cascade = {CascadeType.ALL} , mappedBy = "pk.user")
	private List<UserOpdcard> user_opd = new Vector<>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String uesr_id, String user_name, String user_sex, String idcard, Date birthday, String tel,
			String address, TypeUser typeuser) {
		super();
		this.uesr_id = uesr_id;
		this.user_name = user_name;
		this.user_sex = user_sex;
		this.idcard = idcard;
		this.birthday = birthday;
		this.tel = tel;
		this.address = address;
		this.typeuser = typeuser;
	}

	public String getUesr_id() {
		return uesr_id;
	}

	public void setUesr_id(String uesr_id) {
		this.uesr_id = uesr_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public TypeUser getTypeuser() {
		return typeuser;
	}

	public void setTypeuser(TypeUser typeuser) {
		this.typeuser = typeuser;
	}

	public List<UserPatient> getDoc_pat() {
		return doc_pat;
	}

	public void setDoc_pat(List<UserPatient> doc_pat) {
		this.doc_pat = doc_pat;
	}

	public List<UserOpdcard> getUser_opd() {
		return user_opd;
	}

	public void setUser_opd(List<UserOpdcard> user_opd) {
		this.user_opd = user_opd;
	}
	
	

}
