package com.ford.training.java.lang;

public class ArrayProcessor {
	private int[] arr;
	
	public ArrayProcessor(int size) {
		arr = new int[size];
	}
	
	public void put(int index,int value) {
		arr[index] = value;
	}
	
	public void show() {
		int k = 0;
		while (k < arr.length) {
			System.out.println("Sýra " + k + " value : " + arr[k]);
			k++;
		}
	}
	
}
