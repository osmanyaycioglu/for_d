package com.ford.training.java.example.car;

public class Araba {
	private int beygirGucu;
	private int motorHacmi;
	
	public Araba(int beygirGucu, int motorHacmi) {
		this.beygirGucu = beygirGucu;
		this.motorHacmi = motorHacmi;
	}
	
	public double yakitHesapla(int kiloMetre) {
		double sonuc = (double)kiloMetre / (double)(beygirGucu + motorHacmi);
		return sonuc;
	}
}
