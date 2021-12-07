package com.marcos.topaz.dto.result;

import java.util.List;

public class ReverseListResultDTO {
	private List<Double> reverseList;
	

	public ReverseListResultDTO(List<Double> reverseList) {
		this.reverseList = reverseList;
	}

	public List<Double> getReverseList() {
		return reverseList;
	}

	public void setReverseList(List<Double> reverseList) {
		this.reverseList = reverseList;
	}
}
