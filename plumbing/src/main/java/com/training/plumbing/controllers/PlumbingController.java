package com.training.plumbing.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.training.plumbing.model.Training;
import com.training.plumbing.model.TrainingList;

@RestController
@RequestMapping("/api")
public class PlumbingController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/t")
	public List<Training> getTrainings()
	{
	ResponseEntity<List<Training>> rateResponse =
	        restTemplate.exchange("http://traning-service/trainings",HttpMethod.GET, null, new ParameterizedTypeReference<List<Training>>() {
	            });
	List<Training> rates = rateResponse.getBody();
	return rates;
	}
	
	
	
 
}
