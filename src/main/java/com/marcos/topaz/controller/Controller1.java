package com.marcos.topaz.controller;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.topaz.dto.InputIdDTO;



@RequestMapping("/controller1")
@RestController
public class Controller1 {
	
	@GetMapping
	public ResponseEntity<Integer> sum(@RequestHeader Integer firstNumber, @RequestHeader Integer secondNumber){
		System.out.println(firstNumber);
		int result = firstNumber + secondNumber;
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/validateId")
	public ResponseEntity<Boolean> validateId(@RequestBody InputIdDTO id){
		
		System.out.println(id.getId());
		
		return ResponseEntity.ok( id.getId().equals("teste"));
	}
	
	
	@GetMapping("/validate")
	public ResponseEntity<Boolean> validateId(@RequestBody String id){
	
		System.out.println(id);
		System.out.println(id.equals("teste"));
		return ResponseEntity.ok( id.equals("teste"));
	}
	
}
