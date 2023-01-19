package com.klef.jfsd.springboot.model;

import javax.persistence.*;

@Entity
@Table(name="customer_table")
public class Customer {

	@Id
	@GeneratedValue
	private int id;
	@Column(nullable=false,unique=true,length=200)
	private String emailid;
	@Column(nullable=false,unique=true,length=200)
	private String username;
	@Column(nullable=false,length=200)
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", emailid=" + emailid + ", username=" + username + ", password=" + password
				+ "]";
	}
	
}

