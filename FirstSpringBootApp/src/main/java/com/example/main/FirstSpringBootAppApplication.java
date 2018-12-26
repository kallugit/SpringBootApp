package com.example.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;

import com.example.main.models.Engine;
import com.example.main.repositories.EngineRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.example.main.repositories" })
public class FirstSpringBootAppApplication //implements CommandLineRunner {
{
	@Autowired
	EngineRepository engineRepo;

	public static void main(String[] args) {
		System.out.println("Inhere");
		SpringApplication.run(FirstSpringBootAppApplication.class);
//		System.out.println("Inhere2");
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Hello locations = ");
//		List<Engine> engine = engineRepo.findAll();
//		System.out.println("SIZE = " + engine.size());
//	}

}
