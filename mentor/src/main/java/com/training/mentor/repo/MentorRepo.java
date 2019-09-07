package com.training.mentor.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.mentor.entity.Mentor;


public interface MentorRepo extends JpaRepository<Mentor, Long>{
	List<Mentor> findByPassword(String password);
}
