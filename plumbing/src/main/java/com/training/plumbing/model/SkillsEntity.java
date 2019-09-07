package com.training.plumbing.model;

import javax.persistence.*;

public class SkillsEntity {


	private Long id;
	

	private String name;
	

	private String tableOfContents;
	

	private String prerequisites;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTableOfContents() {
		return tableOfContents;
	}


	public void setTableOfContents(String tableOfContents) {
		this.tableOfContents = tableOfContents;
	}


	public String getPrerequisites() {
		return prerequisites;
	}


	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	} 
	
	
	
	
}
