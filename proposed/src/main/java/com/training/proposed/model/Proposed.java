package com.training.proposed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proposed {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="calid")
	private Long calId;
	@Column(name="userId")
	private Long userId;
	@Column(name="status")
	private String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCalId() {
		return calId;
	}
	public void setCalId(Long calId) {
		this.calId = calId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Proposed(Long calId, Long userId, String status) {
		super();
		
		this.calId = calId;
		this.userId = userId;
		this.status = status;
	}
	public Proposed() {
		super();
	}
	
	
	
	
	
}
