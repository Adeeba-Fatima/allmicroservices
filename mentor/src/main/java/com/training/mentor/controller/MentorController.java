package com.training.mentor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.mentor.entity.Mentor;
import com.training.mentor.entity.MentorL;
import com.training.mentor.entity.MentorLogin;
import com.training.mentor.repo.MentorRepo;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/mentor")
public class MentorController {

	@Autowired
	private MentorRepo repo;
	 @GetMapping("/register") 
	  public void createMentor(@RequestBody Mentor mentor)
	  { 
		 
			// System.out.println(mentor.getName()+"Mentor name");
		 	repo.save(mentor);
		  
	  }  
	 
	 
	 
	   @PostMapping("/login")
	    public Mentor loginaa(@RequestBody MentorL userlogin)
	                                                  {

	    	 Optional<Mentor> Usr= repo.findById(userlogin.getId());
	    	if(Usr.isPresent())
	    	{
	    		
	        List<Mentor> UsrList = repo.findByPassword(userlogin.getPassword());
	        if(UsrList.isEmpty())
	        {
	        	
	        	return null;
	        }
	        else
	        {
	        	return UsrList.get(0);
	        }
	        
	    	}
	    	
	    	else
	    	{
	    		return null;
	    	}
	        
	    }
	
}
