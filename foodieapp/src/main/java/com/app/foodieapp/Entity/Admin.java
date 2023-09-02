package com.app.foodieapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	int admin_id;
	@Column
	String adminName;
	public Admin(int admin_id, String adminName) {
		super();
		this.admin_id = admin_id;
		this.adminName = adminName;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	
}
