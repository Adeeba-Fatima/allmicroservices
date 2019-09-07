package com.training.proposed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.proposed.Repo.ProposedRepository;
import com.training.proposed.model.Proposed;
import com.training.proposed.model.proposedr;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/proposed")
public class ProposedController {
	@Autowired
	ProposedRepository proposedRepo;

	
	@GetMapping("/getall")
	public List<Proposed> getAllCourses()
	{
		List<Proposed> ProposedList=proposedRepo.findAll();
	
		return ProposedList;
	}
	 @PostMapping("/register") 
	  public Proposed createUser(@RequestBody proposedr userlogin)
	  { 
		 Proposed user =  new Proposed(userlogin.getCalId(),userlogin.getUserId(),userlogin.getStatus());
		  
		
		
			   if(proposedRepo.save(user) != null)
			   {
				   return user;
			   }

		return null;
		  
	  }  
	
	
	

}
