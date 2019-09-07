package com.training.progress.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Progress {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="propasal_id")
	private String propasal_id;
	@Column(name="progress")
	private String progress;
	@Column(name="date_of_entry")
	private String date_of_entry;
	@Column(name="rating")
	private String rating;
	@Column(name="remark")
	private String remark;
	@Column(name="payment_id")
	private String payment_id;
	@Column(name="amount")
	private String amount;

	
	
	
}
