package com.ford.calc;

public class Calistir3 {
	public static void main(String[] args) {
		HesapMakinesi3 y = new HesapMakinesi3();
		
		y.deger1 = 20;
		y.deger1 = 10;
		y.topla();
		System.out.println("Toplama sonucu : " + y.sonuc);
		y.cikar();
		System.out.println("Çýkarma sonucu : " + y.sonuc);
	}
}
