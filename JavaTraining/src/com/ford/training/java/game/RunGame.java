package com.ford.training.java.game;

import java.util.Random;
import java.util.Scanner;

public class RunGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int g = r.nextInt(100);
		int t = 0;
		while (true) {
			System.out.println("0 ile 100 arasýnda sayý tahmin edin : ");
			int j = s.nextInt();
			if (j == g) {
				System.out.println(t + " kadar turda bildiniz");
				break;
			} else if (j > g) {
				System.out.println("Sayýyý biraz düþür.");
			} else if (j < g) {
				System.out.println("Sayýyý biraz büyüt.");
			}
			t++;
		}
	}
}
