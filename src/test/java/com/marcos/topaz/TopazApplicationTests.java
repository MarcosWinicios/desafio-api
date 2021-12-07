package com.marcos.topaz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.marcos.topaz.service.Services;

@SpringBootTest
class TopazApplicationTests {

	@Autowired
	private Services services;

	@Test
	public void mustAddTheValues() {
		assertEquals(9.6, services.sum(3.5, 6.1));
	}
	
	@Test
	public void mustReturnTheListInDescendingOrder() {
		List<Double> numbersList = new ArrayList<>();

		numbersList.add(2.4);
		numbersList.add(1.0);
		numbersList.add(9.5);
		numbersList.add(0.0);
		numbersList.add(-9.0);

		List<Double> reverseNumbersList = services.reverseList(numbersList);
		assertEquals(-9.0, Collections.min(reverseNumbersList));
		assertEquals(9.5, Collections.max(reverseNumbersList));
	}
	
	@Test/*Validar se a string(id) tem no máximo 12 caracteres e inicia com a letra A*/
	public void mustValidateId() {
		assertTrue(services.validateId("a1234"));
	}

}
