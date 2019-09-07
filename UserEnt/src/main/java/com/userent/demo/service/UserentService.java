package com.userent.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userent.demo.entity.UsrEntity;
import com.userent.demo.repository.RecordNotFoundException;
import com.userent.demo.repository.Userrepo;

@Service
public class UserentService {

	@Autowired
	private Userrepo repo;
	
	 public List<UsrEntity> getAllMentors()
	    {
	        List<UsrEntity> UsrList = repo.findAll();
	         
	        if(UsrList.size() > 0) {
	            return UsrList;
	        } else {
	            return new ArrayList<UsrEntity>();
	        }
	    }
	 
	   public UsrEntity getUsrById(Long id) throws RecordNotFoundException
	    {
	        Optional<UsrEntity> Usr = repo.findById(id);
	         
	        UsrEntity u= new UsrEntity("","","","",0L,0,"");
	        
	        if(Usr.isPresent()) {
	            return Usr.get();
	        } else {
	        	return u;
	        }
			
	    }
	     
	/*
	 * public UsrEntity createOrUpdateUsr(UsrEntity entity) throws
	 * RecordNotFoundException { Optional<UsrEntity> Usr =
	 * repo.findById(entity.getId());
	 * 
	 * if(Usr.isPresent()) { UsrEntity newEntity = Usr.get();
	 * newEntity.setEmail(entity.getEmail());
	 * newEntity.setFirstName(entity.getFirstName());
	 * newEntity.setLastName(entity.getLastName());
	 * newEntity.setActive(entity.getActive());
	 * newEntity.setContactNumber(entity.getContactNumber());
	 * newEntity.setName(entity.getName());
	 * newEntity.setPassword(entity.getPassword()); newEntity =
	 * repo.save(newEntity);
	 * 
	 * return newEntity; } else { entity = repo.save(entity);
	 * 
	 * return entity; } }
	 */
	     
	   
	    public void deleteUsrById(Long id) throws RecordNotFoundException
	    {
	        Optional<UsrEntity> Usr = repo.findById(id);
	         
	        if(Usr.isPresent())
	        {
	            repo.deleteById(id);
	        } else {
	            throw new RecordNotFoundException("No employee record exist for given id");
	        }
	    }
	    
	    public UsrEntity loginauth(Long id,String password)
	    {  UsrEntity u= new UsrEntity("","","","",0L,0,"");
	    	 Optional<UsrEntity> Usr= repo.findById(id);
	    	if(Usr.isPresent())
	    	{
	    		
	        List<UsrEntity> UsrList = repo.findByPassword(password);
	        if(UsrList.isEmpty())
	        {
	        	
	        	return u;
	        }
	        else
	        {
	        	return UsrList.get(0);
	        }
	        
	    	}
	    	
	    	else
	    	{
	    		return u;
	    	}
	    }
	    
	    
	    
	  
/*	    UsrEntity ue = new UsrEntity();
	    public UsrEntity loginVerification(String password,String Role)
	    {
	    	
	    	ue=repo.findByPasswordAndRole(password, Role);
	    	return ue;
	    	
	    	
	    }*/
	 
}
