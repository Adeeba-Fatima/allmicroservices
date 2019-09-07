package com.training.TrainingService.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.TrainingService.model.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long>{
	List<Training> findBySkillId(String skillId);
	
}
