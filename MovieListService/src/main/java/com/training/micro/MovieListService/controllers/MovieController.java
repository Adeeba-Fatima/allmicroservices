package com.training.micro.MovieListService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.micro.MovieListService.model.Movie;

@RestController
@RequestMapping("/api")
public class MovieController {
	
	@Autowired
	private Environment env;

	@RequestMapping("/movies/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		Movie movie= new Movie(movieId, "ServiceMovie"+movieId, "Action Movie!!!");
		System.out.println("used on"+ this.env.getProperty("server.port"));
		return movie;
	}
	
}
