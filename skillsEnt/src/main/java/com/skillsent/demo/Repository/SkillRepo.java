package com.skillsent.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillsent.demo.entity.SkillsEntity;

@Repository
public interface SkillRepo extends JpaRepository<SkillsEntity, Long>{

}
