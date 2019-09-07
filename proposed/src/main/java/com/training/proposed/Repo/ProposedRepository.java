package com.training.proposed.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.proposed.model.Proposed;
@Repository
public interface ProposedRepository extends JpaRepository<Proposed, Long> {
	
	

}
