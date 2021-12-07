package com.marcos.topaz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.topaz.dto.input.IdInputDTO;
import com.marcos.topaz.dto.result.SumResultDTO;
import com.marcos.topaz.dto.result.ValidationIdResultDTO;
import com.marcos.topaz.service.Services;



@RequestMapping("/controller1")
@RestController
public class Controller1 {
	
	@Autowired
	private Services service;
	
	@GetMapping("/sum")
	public ResponseEntity<SumResultDTO> sum(@RequestHeader Double firstNumber, @RequestHeader Double secondNumber){	
		Double result = service.sum(firstNumber, secondNumber);
		return ResponseEntity.ok(new SumResultDTO(result));
	}
	
	@GetMapping("/validate-id")
	public ResponseEntity<ValidationIdResultDTO> validateId(@RequestBody IdInputDTO id){		
		return ResponseEntity.ok(new ValidationIdResultDTO(service.validateId(id.getId())));
	}
}
