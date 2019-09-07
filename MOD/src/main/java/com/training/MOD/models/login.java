package com.training.MOD.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="login")
public class login {


	public login() {
		super();
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idlogin;
	
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private String role;

	public login(String email, String password, String role) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public Long getIdlogin() {
		return idlogin;
	}

	public void setIdlogin(Long idlogin) {
		this.idlogin = idlogin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	
	
}
