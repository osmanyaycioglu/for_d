package com.ford.calc;

public class Calistir {
	public static void main(String[] args) {
		HesapMakinesi1 h = new HesapMakinesi1();
		h.setDeger1(20);
		h.setDeger2(0); 
		
		int tSonuc = h.topla();
		System.out.println("Toplama sonucu : " + tSonuc);

		int cSonuc = h.cikar();
		System.out.println("��kartma sonucu : " + cSonuc);
	
		int caSonuc = h.carp();
		System.out.println("�arpma sonucu : " + caSonuc);

		int bSonuc = h.bol();
		System.out.println("B�lme sonucu : " + bSonuc);
		
		System.out.println("Toplama sonucu : " + h.topla());
		System.out.println("��kartma sonucu : " + h.cikar());
		System.out.println("�arpma sonucu : " + h.carp());
		System.out.println("B�lme sonucu : " + h.bol());
		
	}
}
