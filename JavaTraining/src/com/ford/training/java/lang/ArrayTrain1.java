package com.ford.training.java.lang;

import java.util.Scanner;

public class ArrayTrain1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayTrain1.m1(sc);

	}
	
	public static void m1(Scanner abc) {
		InputProcessor ip = new InputProcessor();
		ip.process(abc);
	}
}
