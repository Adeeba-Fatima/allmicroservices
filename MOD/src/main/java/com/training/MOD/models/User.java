package com.training.MOD.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long userid;

    @JoinColumn(name = "idlogin")
    @OneToOne(cascade = CascadeType.ALL)
	private login idlogin;

	@Column
	private String email;
	
	@Column
	private String firstname;


	@Column
	private String lastname;
	
	//@Positive(message="contact number should be a positive value")
	@Column
	private Long contact;
	
	
	@Column(name="active")
	private int active;
	

	public User() {
		super();
	}

	public User(login idlogin, String email, String firstname, String lastname, Long contact, int active) {
		super();
	
		this.idlogin = idlogin;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
		this.active = active;
	}




	public Long getUserid() {
		return userid;
	}




	public void setUserid(Long userid) {
		this.userid = userid;
	}




	public login getIdlogin() {
		return idlogin;
	}




	public void setIdlogin(login idlogin) {
		this.idlogin = idlogin;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getFirstname() {
		return firstname;
	}




	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public Long getContact() {
		return contact;
	}




	public void setContact(Long contact) {
		this.contact = contact;
	}




	public int getActive() {
		return active;
	}




	public void setActive(int active) {
		this.active = active;
	}

	
	
	
}
