package com.example.main.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.main.models.Body;
import com.example.main.repositories.BodyRepository;

@Service
public class BodyService {
	
	BodyRepository bodyRepository;
	public BodyService(BodyRepository bodyRepository) {
		this.bodyRepository=bodyRepository;
	}
 
	public List<Body> getAllBodyInfo(){
		return bodyRepository.findAll();
	}
	
	public Body getByBodyId(int id) {
		return bodyRepository.getOne(id);
	}
}