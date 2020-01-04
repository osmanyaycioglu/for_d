package com.ford.training.java.example.car;

public class StaticYakitHesaplaCalistir {
	public static void main(String[] args) {
		double bmwYakit = YakitHesaplama.hesapla(170, 1600, 100);
		System.out.println("BMW 100 km de : " + bmwYakit + " litre harcýyor.");
		
		double mercedesYakit = YakitHesaplama.hesapla(156, 1500, 100);
		System.out.println("BMW 100 km de : " + mercedesYakit + " litre harcýyor.");
		
	}
}
