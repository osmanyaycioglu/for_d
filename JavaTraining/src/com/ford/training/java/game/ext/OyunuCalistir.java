package com.ford.training.java.game.ext;

import java.util.Scanner;

public class OyunuCalistir {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int limit = 50;
		Oyun oy = new Oyun(limit);
		while (oy.devamEdeyimMi()) {
			System.out.println("0 ile " + limit + " arasýnda sayý tahmin edin : ");
			int j = s.nextInt();
			String ipUcu = oy.tahminEt(j);
			System.out.println(ipUcu);
		}
	}
}
