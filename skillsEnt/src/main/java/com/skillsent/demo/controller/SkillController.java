package com.skillsent.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillsent.demo.Repository.SkillRepo;
import com.skillsent.demo.Service.SkillsService;
import com.skillsent.demo.entity.RecordNotFoundException;
import com.skillsent.demo.entity.SkillsEntity;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/slow")
public class SkillController {

	@Autowired
	private SkillsService service;
	@Autowired
	private SkillRepo repo;
	
	@RequestMapping("/")
	public ResponseEntity<List<SkillsEntity>> showAll()
	{
		List<SkillsEntity> list=service.getall();
		return new ResponseEntity<List<SkillsEntity>>(list,new HttpHeaders(),HttpStatus.OK);
		
	}
	
	@GetMapping("/getskills/{id}")
    public ResponseEntity<SkillsEntity> getUsrById(@PathVariable("id") Long id)
                                                    throws RecordNotFoundException {
        SkillsEntity entity = service.getSkillById(id);
 
        return new ResponseEntity<SkillsEntity>(entity, new HttpHeaders(), HttpStatus.OK);
    }
	
	 @PostMapping("/reg") 
	  public SkillsEntity createUser(@RequestBody SkillsEntity userlogin)
	  { 
		 
		  
		 SkillsEntity user =  new SkillsEntity(userlogin.getId(), userlogin.getName(), userlogin.getTableOfContents(), userlogin.getPrerequisites());
		  
		
		  
		  
			   if(repo.save(user) != null)
			   {
				   return userlogin;
			   }
				 
			   
		   
		   
		return userlogin;
		  
	  }   
	
	
}
