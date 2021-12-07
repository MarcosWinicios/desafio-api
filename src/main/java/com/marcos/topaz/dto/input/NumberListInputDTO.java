package com.marcos.topaz.dto.input;

import java.util.List;

public class NumberListInputDTO {
	private List<Double> numbersList;
	
	
	public NumberListInputDTO() {}
	
	public NumberListInputDTO(List<Double> list) {
		this.numbersList = list;
	}

	public List<Double> getNumbersList() {
		return numbersList;
	}

	public void setNumberList(List<Double> numbersList) {
		this.numbersList = numbersList;
	}
}
