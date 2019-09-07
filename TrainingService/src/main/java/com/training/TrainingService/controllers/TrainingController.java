package com.training.TrainingService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.TrainingService.Repo.TrainingRepository;
import com.training.TrainingService.model.Training;
import com.training.TrainingService.model.TrainingList;

@RestController
public class TrainingController {
	@Autowired
	TrainingRepository trainingRepo;
	
	
	@GetMapping("/trainings")
	public List<Training> getAllCourses()
	{
		List<Training> trainingList=trainingRepo.findAll();
	
		return trainingList;
	}
	@PostMapping(path = "/traininglist")
	public List<Training> getAllTrainingsByCourse(String skillId)
	{
		List<Training> trainingList=trainingRepo.findBySkillId(skillId);
	
		return trainingList;
	}

}
