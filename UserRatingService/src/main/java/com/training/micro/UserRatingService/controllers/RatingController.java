package com.training.micro.UserRatingService.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.micro.UserRatingService.model.Rating;
import com.training.micro.UserRatingService.model.UserRating;

@RestController
@RequestMapping("/api")
public class RatingController {

	/*@RequestMapping("/rating/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		Rating rating =new Rating(movieId,4);
		return rating;
	}*/
	
	//Required to return a list of ratings based on userid provided
	/*@RequestMapping("/rating/{userId}")
	public List<Rating> getRating(@PathVariable("userId") String userId) {
		
		//dummy list of rating to return
		List<Rating> ratingList=new ArrayList<>();
		ratingList.add(new Rating("1234",4));
		ratingList.add(new Rating("5678",3));
		ratingList.add(new Rating("9876",3));
		
		return ratingList;
	}*/
	
	//return a wrapper object for rating list
	@RequestMapping("/rating/{userId}")
	public UserRating getRating(@PathVariable("userId") String userId) {
		UserRating userRating=new UserRating();
		userRating.initRatings(userId);
		return userRating;
	}
	
}
