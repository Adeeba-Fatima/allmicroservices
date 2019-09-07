package com.training.progress.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.progress.model.Progress;
@Repository
public interface ProgressRepository extends JpaRepository<Progress, Long>{

}
