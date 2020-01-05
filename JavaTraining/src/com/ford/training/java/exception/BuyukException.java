package com.ford.training.java.exception;

public class BuyukException extends Exception {
	private String mesaj;

	public BuyukException(String mesaj) {
		super();
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
	
}
