package com.ford.training.java.exception;

public class Hesap {

	public int hesapla(int deg1, int deg2) throws MyException, BuyukException {
		if (deg1 < 20 || deg2 < 20) {
			throw new MyException();
		}
		if (deg1 > 100 || deg2 > 100) {
			throw new BuyukException("De�er 100 den b�y�k olamaz");
		}

		return deg1 + deg2;

	}

}
