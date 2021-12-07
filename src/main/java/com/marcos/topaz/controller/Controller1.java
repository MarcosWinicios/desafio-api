package com.marcos.topaz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.topaz.dto.InputIdDTO;
import com.marcos.topaz.service.Services;



@RequestMapping("/controller1")
@RestController
public class Controller1 {
	
	@Autowired
	private Services service;
	
	@GetMapping("/sum")
	public ResponseEntity<Double> sum(@RequestHeader Double firstNumber, @RequestHeader Double secondNumber){		
		return ResponseEntity.ok(service.sum(firstNumber, secondNumber));
	}
	
	@GetMapping("/validate-id")
	public ResponseEntity<Boolean> validateId(@RequestBody String id){		
		return ResponseEntity.ok( service.validateId(id));
	}
	
	@GetMapping("/validate")
	public ResponseEntity<String> validateIdRegex(@RequestBody String id){
		
		System.out.println(id);
		
		return ResponseEntity.ok( id);
	}
	
	
	
	
}
