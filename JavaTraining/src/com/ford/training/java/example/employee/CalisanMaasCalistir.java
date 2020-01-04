package com.ford.training.java.example.employee;

public class CalisanMaasCalistir {
	public static void main(String[] args) {
		Calisan calisan = new Calisan("Osman", "Yaycýoðlu", 50, 30);
		int maas = calisan.maasHesapla();
		System.out.println("Maas : " + maas);
	}
}
