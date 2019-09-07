package com.skillsent.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillsent.demo.Repository.SkillRepo;
import com.skillsent.demo.entity.RecordNotFoundException;
import com.skillsent.demo.entity.SkillsEntity;

@Service
public class SkillsService {
    
	@Autowired
	private SkillRepo repo;
	
	public List<SkillsEntity> getall()
	{
		List<SkillsEntity> Skills=repo.findAll();
		
		if(!Skills.isEmpty())
		{
		return Skills;	
		}
		else
			return new ArrayList<SkillsEntity>();
	}
	
	public SkillsEntity getSkillById(Long id) throws RecordNotFoundException
	{
		Optional<SkillsEntity> skills=repo.findById(id);
		if(skills.isPresent())
			return skills.get();
		else
			 throw new RecordNotFoundException("No employee record exist for given id");
	}
	
	
	
	
	
}
