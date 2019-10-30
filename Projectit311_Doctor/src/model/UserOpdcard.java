package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Remedy")
public class UserOpdcard {
	@EmbeddedId
	private UserOpdcardID pk = new UserOpdcardID();
	
	@Column(name="remedy_date")
	private Date remedy_date;
	
	@Column(name="syndrome")
	private String syndrome;

	public UserOpdcard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserOpdcard(UserOpdcardID pk, Date remedy_date, String syndrome) {
		super();
		this.pk = pk;
		this.remedy_date = remedy_date;
		this.syndrome = syndrome;
	}

	public UserOpdcardID getPk() {
		return pk;
	}

	public void setPk(UserOpdcardID pk) {
		this.pk = pk;
	}

	public Date getRemedy_date() {
		return remedy_date;
	}

	public void setRemedy_date(Date remedy_date) {
		this.remedy_date = remedy_date;
	}

	public String getSyndrome() {
		return syndrome;
	}

	public void setSyndrome(String syndrome) {
		this.syndrome = syndrome;
	}
	
	

}
