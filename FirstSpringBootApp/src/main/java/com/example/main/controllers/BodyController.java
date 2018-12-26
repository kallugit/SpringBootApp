package com.example.main.controllers;

import com.example.main.models.Body;
import com.example.main.services.BodyService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("bodies")
public class BodyController {

    BodyService bodyService;

	private BodyController(BodyService bodyService) {
		 this.bodyService= bodyService; 
	 }

	@GetMapping("")
	 public ResponseEntity<List<Body>> getAllBodyInfo(){
		  return ResponseEntity.ok(bodyService.getAllBodyInfo());
		  
	 }

	@GetMapping("/{id}")
	public ResponseEntity<Body> getBodyByID(@PathVariable String bodyId){
        
		Body body=bodyService.getByBodyId(Integer.valueOf(bodyId));
		return ResponseEntity.ok(body);
	}
	}




