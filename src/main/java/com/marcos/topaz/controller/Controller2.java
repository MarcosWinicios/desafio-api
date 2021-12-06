package com.marcos.topaz.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.topaz.dto.InputIdDTO;



@RequestMapping("/controller2")
@RestController
public class Controller2 {
	
	@PostMapping
	public ResponseEntity<Object> orndenarLista(@RequestBody InputIdDTO numbers){
		String[] list =  numbers.getId().split(",");
		List<Integer> listaNumerica = new ArrayList<>();
		for(String str: list) {
			listaNumerica.add(Integer.parseInt(str));
		}
//		personsList.sort(Comparator.comparing(Person::getAge, Comparator.reverseOrder()));
		Collections.sort(listaNumerica, Collections.reverseOrder());
	
		System.out.println();
//		Collections.reverse(listaNumerica);
//		Collections.sort(listaNumerica, Collections.reverseOrder());
		System.out.println(listaNumerica);
		
		return ResponseEntity.ok(listaNumerica);
	}
	
	@PostMapping("/teste")
	public ResponseEntity<Object> orndenarLista2(@RequestBody List<Double> numbers){
		
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println(numbers);
		
		return ResponseEntity.ok(numbers)	;
	}
}
