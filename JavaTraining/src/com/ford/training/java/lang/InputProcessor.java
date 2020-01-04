package com.ford.training.java.lang;

import java.util.Scanner;

public class InputProcessor {
	
	public void process(Scanner zyf) {
		System.out.println("Array size : ");
		
		int size = zyf.nextInt();
		
		ArrayProcessor ap = new ArrayProcessor(size);
		System.out.println("Ýlk sayýyý giriniz : ");
		ap.put(0, zyf.nextInt());

		System.out.println("Ýkinci sayýyý giriniz : ");
		ap.put(1, zyf.nextInt());
		
		ap.show();

	}
}
