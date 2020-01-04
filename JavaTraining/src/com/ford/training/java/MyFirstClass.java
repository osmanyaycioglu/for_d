package com.ford.training.java;

public class MyFirstClass {
	public int value1 = 50;
	public int value2;
	
	public int toplama() {
		int sonuc = value1 + value2;
		return sonuc;
	}
	
	public int toplama2() {
		return value1 + value2;
	}
	
	public int toplama3(int value3) {
		return value1 + value2 + value3;
	}
	public int toplama4(int value3,int value4) {
		return value1 + value2 + value3 + value4;
	}
	
	
	public void yaz() {
		System.out.println("sonuc : " + (value1 + value2));
	}

}
