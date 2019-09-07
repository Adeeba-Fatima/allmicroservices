package com.training.micro.CatalogService.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.micro.CatalogService.model.Catalog;
import com.training.micro.CatalogService.model.Movie;
import com.training.micro.CatalogService.model.Rating;
import com.training.micro.CatalogService.model.UserRating;

@RestController
@RequestMapping("/api")
public class CatalogController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/catalog/{userId}")
	public List<Catalog> getCatalogOfUser(@PathVariable("userId") String userId) {
		
		//initiate the RestTemplate
		//should be exposed as bean...
		//RestTemplate restTemplate=new RestTemplate();
		
		
		List<Catalog> catalogList=new ArrayList<>();
		//need to fetch movieId and ratings (Collection) from UserRating Service
		//version 1 : create a dummy collection
		/*List<Rating> ratingList=new ArrayList<>();
		ratingList.add(new Rating("1234",4));
		ratingList.add(new Rating("5678",3));
		ratingList.add(new Rating("9876",3));
		*/
		//version2 : fetch from service
		//UserRating userRating=restTemplate.getForObject("http://localhost:9093/api/rating/" + userId,UserRating.class);
		
		//version 3: using service discovery
		UserRating userRating=restTemplate.getForObject("http://user-rating-service/api/rating/" + userId,UserRating.class);
		
		
		//need to fetch the movie detail for each movie Id (loop through collection) fetched from the UserRating Service
		//create catalog collection combining both the data..
		//version 1: loop through dummy collection and create dummy movie details
		//for(Rating rating:ratingList) {
		//version 2:loop through the data(list) recieved from Rating Service
		
		for(Rating rating:userRating.getRatings()) {
			//Movie movie=new Movie(rating.getMovieId(), "DummyMovie" + rating.getMovieId(), "Nice Movie!!!");
			//version2 : fetch data from another service using RestTemplate
			//this.restTemplate.getForObject(<rest endpoint url>, <response type>);
			//Movie movie= this.restTemplate.getForObject("http://localhost:9092/api/movies/" + rating.getMovieId(), Movie.class);
			
			//version 3: using service discovery
			Movie movie= this.restTemplate.getForObject("http://movie-list-service/api/movies/" + rating.getMovieId(), Movie.class);
			Catalog catalog=new Catalog(movie.getMovieName(), movie.getMovieDesc(), rating.getRating());
			catalogList.add(catalog);
		}
		
		
		
		
		
		
		/*List<Catalog> catalogList=new ArrayList<>();
		catalogList.add(new Catalog("FirstMovie","FirstDesc",4));
		catalogList.add(new Catalog("Secondovie","SecondDesc",1));
		catalogList.add(new Catalog("ThirdMovie","ThirdDesc",3));*/
		return catalogList;
	}
}
