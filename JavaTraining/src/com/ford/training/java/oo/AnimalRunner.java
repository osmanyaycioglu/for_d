package com.ford.training.java.oo;

import java.util.Scanner;

public class AnimalRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-Kedi,2-Köpek,3-Aslan,4-Hayvan");
		int secim = scanner.nextInt();
		IAnimal hayvan = null;
		switch (secim) {
		case 1: {
			hayvan = new Kedi();
		}
			break;
		case 2: {
			hayvan = new Kopek();
		}
			break;
		case 3: {
			hayvan = new Aslan();
		}
			break;
		case 4: {
			hayvan = new Hayvan();
		}
			break;

		default:
			break;
		}
		String s = hayvan.sesCikar();
		int y = hayvan.yemekYe();
		System.out.println(s + " " + y);
	}
}
