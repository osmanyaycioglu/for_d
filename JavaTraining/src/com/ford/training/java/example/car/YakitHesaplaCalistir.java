package com.ford.training.java.example.car;

public class YakitHesaplaCalistir {
	public static void main(String[] args) {
		Araba bmw = new Araba(170, 1600);
		double bmwYakit = bmw.yakitHesapla(100);
		System.out.println("BMW 100 km de : " + bmwYakit + " litre harcýyor.");
		
		Araba mercedes = new Araba(156, 1500);
		double mercedesYakit = mercedes.yakitHesapla(100);
		System.out.println("Mercedes 100 km de : " + mercedesYakit + " litre harcýyor.");
		
		
	}
}
