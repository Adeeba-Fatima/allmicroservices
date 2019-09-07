package com.userent.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userent.demo.entity.UserLogin;
import com.userent.demo.entity.UserLoginModal;
import com.userent.demo.entity.UsrEntity;
import com.userent.demo.repository.RecordNotFoundException;
import com.userent.demo.repository.Userrepo;
import com.userent.demo.service.UserentService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UsrController {

	@Autowired
	private UserentService service;
	
	@Autowired
	private Userrepo repo;

	@GetMapping("/getUsers")
    public ResponseEntity<List<UsrEntity>> getAllMentors() {
        List<UsrEntity> list = service.getAllMentors();
 
        return new ResponseEntity<List<UsrEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }

	  @GetMapping("/getuser/{id}")
	    public ResponseEntity<UsrEntity> getUsrById(@PathVariable("id") Long id)
	                                                    throws RecordNotFoundException {
	        UsrEntity entity = service.getUsrById(id);
	 
	        return new ResponseEntity<UsrEntity>(entity, new HttpHeaders(), HttpStatus.OK);
	    }
	/*
	 * @GetMapping("/getuser/{password}/{role}") public ResponseEntity<UsrEntity>
	 * loginaa(@PathVariable("password") String password,@PathVariable("role")
	 * String role) { UsrEntity entity = service.loginVerification(password, role);
	 * return new ResponseEntity<UsrEntity>(entity, new HttpHeaders(),
	 * HttpStatus.OK);
	 * 
	 * }
	 */
	  
	/*
	 * @PostMapping(path = "/add") public ResponseEntity<UsrEntity>
	 * createOrUpdateUsr(UsrEntity Usr) throws RecordNotFoundException { UsrEntity
	 * updated = service.createOrUpdateUsr(Usr); return new
	 * ResponseEntity<UsrEntity>(updated, new HttpHeaders(), HttpStatus.OK); }
	 */
	 
	  
	  @PostMapping("/register") 
	  public UserLogin createUser(@RequestBody UserLogin userlogin)
	  { 
		  
		  
		  UsrEntity user =  new UsrEntity( userlogin.getName(),userlogin.getPassword(),userlogin.getFirstName(),userlogin.getLastName(),userlogin.getContactNumber(),1,userlogin.getEmail());
		  
		
		
			   if(repo.save(user) != null)
			   {
				   return userlogin;
			   }
				      
			   
		  
		   
		return null;
		  
	  }  

	    @RequestMapping("/delete/{id}")
	    public HttpStatus deleteUsrById(@PathVariable("id") Long id)
	                                                    throws RecordNotFoundException {
	        service.deleteUsrById(id);
	        return HttpStatus.FORBIDDEN;
	    }
	    @PostMapping(path = "/login")
	    public UsrEntity loginaa(@RequestBody UserLoginModal userlogin)
	                                                    throws RecordNotFoundException {
	       UsrEntity ur = service.loginauth(userlogin.getId(),userlogin.getPassword());
		return ur;
	        
	    }
	 
	
}
