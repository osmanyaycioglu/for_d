package com.ford.training.java.exception;


public class HesapCalistir {
	public static void main(String[] args) {
		try {
			Hesap h = new Hesap();
			int sonuc = h.hesapla(10, 30);
			System.out.println("Sonuc : " + sonuc);
		} catch (MyException e) {
			System.out.println("MyException geldi.");
			e.printStackTrace();
		} catch (BuyukException e) {
			System.out.println("BuyukException geldi : "  + e.getMesaj());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
