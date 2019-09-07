package com.training.micro.UserRatingService.model;

import java.util.ArrayList;
import java.util.List;

public class UserRating {

	private String userId;
	private List<Rating> ratings;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	
	//custom method to initialize the ratings collection
	public void initRatings(String userId) {
		//dummy initialization
		this.setUserId(userId);
		List<Rating> ratingList=new ArrayList<>();
		ratingList.add(new Rating("1234",4));
		ratingList.add(new Rating("5678",3));
		ratingList.add(new Rating("9876",3));
		this.setRatings(ratingList);
		
	}
}
