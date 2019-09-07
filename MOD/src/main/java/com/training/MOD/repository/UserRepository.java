package com.training.MOD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.MOD.models.User;
import com.training.MOD.models.login;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	//User findByEmail(String email);

}