package com.ford.training.java;

public class Runner {
	public static void main(String[] args) {
		MyFirstClass mfc = new MyFirstClass();
		MyFirstClass afc = mfc;
		MyFirstClass bfc = new MyFirstClass();
		
		MySecondClass msc = new MySecondClass();
		msc.mfc = new MyFirstClass();
		
		mfc.value1 = 100;
		
		int sonuc = mfc.toplama4(10, 20);
		
		System.out.println("Toplama sonucu : " + sonuc);
		
		afc.value1 = 200; 
		bfc.value1 = 300;
		mfc = bfc;
		System.out.println("sonuc 1 : " + mfc.value1);
		System.out.println("sonuc 2 : " + mfc.value2);
		System.out.println("sonuc 3 : " + msc.mfc.value1);
		
		
		
	}
}
