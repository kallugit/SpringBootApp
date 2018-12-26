package com.example.main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.main.models.Engine;
import com.example.main.repositories.EngineRepository;

@Service
public class EngineService {

	EngineRepository engineRepository;
	public EngineService(EngineRepository engineRepository) {
		this.engineRepository = engineRepository;
	}
	public List<Engine> getAllEnginesInfo() {
		return engineRepository.findAll();
	}
	
	  public Engine  getByEngineId(int id) {
		return engineRepository.getOne(id);
	}
}