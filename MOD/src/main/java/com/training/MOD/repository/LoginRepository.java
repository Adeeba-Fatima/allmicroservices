package com.training.MOD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.training.MOD.models.login;


@Repository
public interface LoginRepository extends JpaRepository<login, Integer>{

	login findByEmail(String email);
}
