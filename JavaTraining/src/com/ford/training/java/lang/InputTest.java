package com.ford.training.java.lang;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�lk say�y� giriniz : ");
		int d1 = sc.nextInt();
		System.out.println("�kinci say�y� giriniz : ");
		int d2 = sc.nextInt();

		
		int sonuc = d1 + d2;
		System.out.println("Sonuc : " + sonuc);
		
	}
}
