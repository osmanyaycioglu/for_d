package com.ford.training.java.lang;

import java.util.Random;

public class Arrays {
	public static void main(String[] args) {
		Random r = new Random();
		long z = r.nextLong();

		long[] la = new long[20];
		Long[] loa = new Long[20];
		
		int[] intArray = new int[10];
//		intArray[0] = 10;
//		intArray[8] = 150;
//		intArray[9] = 100;

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("sýra " + i + " : " + intArray[i]);
			if (intArray[i] >= 100) {
				break;
			}
		}

		int k = 0;
		while (k < intArray.length) {
			System.out.println("while sýra " + k + " : " + intArray[k]);
			k++;
		}

		int j = 0;
		do {
			System.out.println("do sýra " + j + " : " + intArray[j]);
			j++;
		} while (j < intArray.length);

		for (int o : intArray) {
			System.out.println("çýktý : " + o);
		}

	}
}
