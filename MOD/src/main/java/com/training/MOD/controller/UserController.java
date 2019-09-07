package com.training.MOD.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

import com.training.MOD.models.User;
import com.training.MOD.models.UserLogin;
import com.training.MOD.models.login;
import com.training.MOD.repository.LoginRepository;
import com.training.MOD.repository.UserRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired                                          
	UserRepository userRepository;
	
	@Autowired
	LoginRepository LoginRepository;
	
	  @PostMapping("/register_user") 
	  public UserLogin createUser(@RequestBody UserLogin userlogin)
	  { 
		  login login = new login(userlogin.getEmail(), userlogin.getPassword(), "user");
		  
		  User user =  new User(login, userlogin.getEmail(), userlogin.getFirstname(), userlogin.getLastname(), userlogin.getContact(), 1);
		  
		
		  
		   if(LoginRepository.save(login) != null)
		   {
			   if(userRepository.save(user) != null)
			   {
				   return userlogin;
			   }
				 
			   
		   }
		   
		return null;
		  
	  }   
	  
	  @GetMapping("/login_user/{email}/{password}") 
	  public login login_user(@PathVariable String email,@PathVariable String password)
	  { 

		  login login = LoginRepository.findByEmail(email);
	
		  if(login.getPassword().equals(password)) 
		  {
			  return login; 
		  }
		 
		  else
		  { 
			 
			  return null;
		  }
		 
	  } 
	
	  @GetMapping("/hello")
		public String hello()
		{
			return "working !";
		}
	
	// Create a new Note
/*	@GetMapping("/notes")
	public User createNote() {
		
		login login = new login("abc@email.com", "123", "user");
		
		User user = new User(login, "abc@email.com", "Rahul", "Dhadvai", 1, 2);
		
		LoginRepository.save(login);
		
	    return userRepository.save(user);
	}  */
}
