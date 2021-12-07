package com.marcos.topaz.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Services {
	
	public Double sum(Double ...numbers) {
		Double result = 0.0;
		for(Double number: numbers) {
			result += number;
		}
		return result;
	}
	
	public boolean validateId(String id) {
		char firstCharacter = id.charAt(0);
		Character.toString(firstCharacter);
		
		return "a"
				.equalsIgnoreCase(Character
						.toString(firstCharacter)) 
				&& id.length() <=12;
	}
	
	public List<Double> reverseList(List<Double> list ){
		Collections.sort(list, Collections.reverseOrder());
		return list;
	}
		
	
	
	public boolean validaarId(String id) {
		System.out.println("Valor: " + id + "\n" + "Tamanho: " + id.length());
		
		System.out.println(id.matches("a"));
		
		return false;
	}
}
