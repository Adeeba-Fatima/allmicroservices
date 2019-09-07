package com.skillsent.demo.entity;

import javax.persistence.*;
@Entity
@Table(name="skills_tbl")
public class SkillsEntity {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="skill_name")
	private String name;
	
	@Column(name="toc")
	private String tableOfContents;
	
	@Column(name ="prerequisites")
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

	public SkillsEntity(Long id, String name, String tableOfContents, String prerequisites) {
		super();
		this.id = id;
		this.name = name;
		this.tableOfContents = tableOfContents;
		this.prerequisites = prerequisites;
	} 
	
	
	public SkillsEntity()
	{
		
	}
	
	
	
}
