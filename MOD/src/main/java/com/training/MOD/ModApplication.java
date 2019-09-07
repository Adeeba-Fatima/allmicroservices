package com.training.MOD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ModApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModApplication.class, args);
	}

}
