package model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
@Embeddable
public class UserOpdcardID implements Serializable {
	@ManyToOne(fetch=FetchType.LAZY)
	private User user;
	
	@ManyToOne
	private Opd_Card  opd_card ;

	public UserOpdcardID() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserOpdcardID(User user, Opd_Card opd_card) {
		super();
		this.user = user;
		this.opd_card = opd_card;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Opd_Card getOpd_card() {
		return opd_card;
	}

	public void setOpd_card(Opd_Card opd_card) {
		this.opd_card = opd_card;
	}
	
	

}
