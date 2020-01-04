package com.ford.training.java.game.ext;

import java.util.Random;

public class Oyun {
	private int oyunLimiti;
	private int g;
	private boolean devamEdeyimMi = true;
	private int tur = 0;
	
	public Oyun(int o) {
		oyunLimiti = o;
		Random r = new Random();
		g = r.nextInt(oyunLimiti);
	}
	
	public String tahminEt(int tahmin) {
		tur++;
		if (tahmin == g) {
			devamEdeyimMi = false;
			return tur + " kadar turda bildiniz";
		} else if (tahmin > g) {
			return "Say�y� biraz d���r.";
		} else if (tahmin < g) {
			return "Say�y� biraz b�y�t.";
		} else {
			return "bilinmeyen";
		}
	}

	public boolean devamEdeyimMi() {
		return devamEdeyimMi;
	}
	
	

}
