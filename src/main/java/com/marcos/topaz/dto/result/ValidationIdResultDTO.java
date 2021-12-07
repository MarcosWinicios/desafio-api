package com.marcos.topaz.dto.result;

public class ValidationIdResultDTO {
	private boolean result;

	public ValidationIdResultDTO(boolean result) {
		this.result = result;
	}
	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
}
