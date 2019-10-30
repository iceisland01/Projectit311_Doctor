package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TypeUser")
public class TypeUser {
	@Id
	private String type_id;
	
	@Column(name="type_name")
	private String type_name;

	public TypeUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeUser(String type_id, String type_name) {
		super();
		this.type_id = type_id;
		this.type_name = type_name;
	}

	public String getType_id() {
		return type_id;
	}

	public void setType_id(String type_id) {
		this.type_id = type_id;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	
	
	

}
