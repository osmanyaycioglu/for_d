package com.ford.training.java.lang;

import java.util.Random;

public class RandomLong {
	public static void main(String[] args) {
		long[] la = new long[20];
		Random r = new Random();
		for (int i = 0; i < la.length; i++) {
			System.out.println("Öncesi : " + la[i]);
			la[i] = r.nextLong();
			System.out.println("Sonrasý : " + la[i]);
		}
		for (int i = 0; i < la.length; i++) {
			for (int j = i + 1; j < la.length; j++) {
				if (la[i] > la[j]) {
					long temp = la[i];
					la[i] = la[j];
					la[j] = temp;
				}
			}
		}
		
		int k = 0;
		while (k < la.length) {
			System.out.println("Sýra " + k + " value : " + la[k]);
			k++;
		}
		long temp = la[16];
		la[16] = la[17];
		la[17] = temp;
	}
}
