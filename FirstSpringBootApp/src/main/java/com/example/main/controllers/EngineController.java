package com.example.main.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.main.models.Engine;
import com.example.main.services.EngineService;

@Controller
@RequestMapping("engines")
public class EngineController {
	
	EngineService engineService;

	private EngineController(EngineService engineService) {
		this.engineService = engineService;
	}
	
	@GetMapping("")
	@PreAuthorize("permitAll")
	public ResponseEntity<List<Engine>> getAllEnginesInfo(){
		System.out.println("In here");
		return ResponseEntity.ok(engineService.getAllEnginesInfo());
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<Engine> getEngineById(@PathVariable String engineId){
	 Engine engine = engineService.getByEngineId(Integer.valueOf(engineId));
	 return ResponseEntity.ok(engine);
	}
}
