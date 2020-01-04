package com.ford.calc;

public class Calistir {
	public static void main(String[] args) {
		HesapMakinesi1 h = new HesapMakinesi1();
		h.setDeger1(20);
		h.setDeger2(0); 
		
		int tSonuc = h.topla();
		System.out.println("Toplama sonucu : " + tSonuc);

		int cSonuc = h.cikar();
		System.out.println("Çýkartma sonucu : " + cSonuc);
	
		int caSonuc = h.carp();
		System.out.println("Çarpma sonucu : " + caSonuc);

		int bSonuc = h.bol();
		System.out.println("Bölme sonucu : " + bSonuc);
		
		System.out.println("Toplama sonucu : " + h.topla());
		System.out.println("Çýkartma sonucu : " + h.cikar());
		System.out.println("Çarpma sonucu : " + h.carp());
		System.out.println("Bölme sonucu : " + h.bol());
		
	}
}
