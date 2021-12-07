package com.marcos.topaz.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.marcos.topaz.service.Services;

@SpringBootTest
class ServicesTest {

	@Autowired
	private Services services;

	@Test/*Validar se ors valores estão sendo somados*/
	public void mustAddTheValues() {
		assertEquals(9.6, services.sum(3.5, 6.1));
	}
	
	@Test/*Validar se a lista numérica é ordenada em ordem descrescente*/
	public void mustReturnTheListInDescendingOrder() {
		List<Double> numbersList = new ArrayList<>();

		numbersList.add(2.4);
		numbersList.add(1.0);
		numbersList.add(9.5);
		numbersList.add(0.0);
		numbersList.add(-9.0);

		List<Double> reverseNumbersList = new ArrayList<>();
		reverseNumbersList.add(9.5);
		reverseNumbersList.add(2.4);
		reverseNumbersList.add(1.0);
		reverseNumbersList.add(0.0);
		reverseNumbersList.add(-9.0);
		
		boolean reverseList = reverseNumbersList
				.equals(services.reverseList(numbersList));
		assertTrue(reverseList);
	}
	
	@Test/*Validar se a string(id) tem no máximo 12 caracteres e inicia com a letra A*/
	public void mustValidateId() {
		assertTrue(services.validateId("a12365489651"));//Inicia com a letra 'A'maiúscula e 12 caracteres
		assertTrue(services.validateId("A12365489651"));//Inicia com a letra 'a' minuscula e 12 caracteres
		assertTrue(services.validateId("A12365489"));//Inicia com a letra 'a' Maiúscula com menos que 12 caracteres
		assertTrue(services.validateId(" A123 65489           "));//Deve ignorar os espaços
		
		assertFalse(services.validateId("a1236589784525"));//Inicia com a letra 'A' e tem mais que 12 caracteres
		assertFalse(services.validateId("c12345678962"));//Não inicia com a letra 'a' mas possui até 12 caracteres
	}
}
