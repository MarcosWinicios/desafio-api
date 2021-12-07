package com.marcos.topaz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.topaz.dto.input.NumberListInputDTO;
import com.marcos.topaz.dto.result.ReverseListResultDTO;
import com.marcos.topaz.service.Services;


@RequestMapping("/controller2")
@RestController
public class Controller2 {
	
	@Autowired
	private Services services;
	
	
	@PostMapping("/reverse-list")
	public ResponseEntity<ReverseListResultDTO> orndenarLista2(@RequestBody NumberListInputDTO numbersList){
		List<Double> reverseList = services.reverseList(numbersList.getNumbersList());
		return ResponseEntity.ok(new ReverseListResultDTO(reverseList));
	}
}
