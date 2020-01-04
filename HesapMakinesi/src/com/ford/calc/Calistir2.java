package com.ford.calc;

public class Calistir2 {
	public static void main(String[] args) {
		HesapMakinesi2 q = new HesapMakinesi2();
		
		int tSonuc =  q.topla(20, 10);
		System.out.println("Toplama sonucu : " + tSonuc);

		System.out.println("Çýkarma sonucu : " + q.cikar(20, 10));
		System.out.println("Çarpma sonucu : " + q.carp(20, 10));
		System.out.println("Bölme sonucu : " + q.bol(20, 10));
	}
}
