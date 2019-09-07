package com.training.micro.CatalogService.model;

public class Catalog {

	private String name;
	private String details;
	private int rating;
	
	
	public Catalog() {
		
	}
	
	public Catalog(String name, String details, int rating) {
		
		this.name = name;
		this.details = details;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
