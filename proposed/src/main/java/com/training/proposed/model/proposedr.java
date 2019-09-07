package com.training.proposed.model;

import javax.persistence.Column;

public class proposedr {


	private Long calId;

	private Long userId;
	
	private String status;

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

	public proposedr(Long calId, Long userId, String status) {
		super();
		this.calId = calId;
		this.userId = userId;
		this.status = status;
	}

	public proposedr() {
		super();
	}
	
	
	
	
}
