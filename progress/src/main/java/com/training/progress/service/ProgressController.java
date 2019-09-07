package com.training.progress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.progress.Repo.ProgressRepository;
import com.training.progress.model.Progress;

@RestController
public class ProgressController {
	@Autowired
	ProgressRepository ProgressRepo;

	
	@GetMapping("/Progress")
	public List<Progress> getAllCourses()
	{
		List<Progress> ProgressList=ProgressRepo.findAll();
	
		return ProgressList;
	}
	
}
