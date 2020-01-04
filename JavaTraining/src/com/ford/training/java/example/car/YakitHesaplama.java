package com.ford.training.java.example.car;

public class YakitHesaplama {
	public static double hesapla(int beygir,int motor,int km) {
		double sonuc = (double)km / (double)(beygir + motor);
		return sonuc;
	}
}
