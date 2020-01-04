package com.ford.training.java.example.employee;

public class Calisan {
	private String isim;
	private String soyisim;
	private int yas;
	private int calismaYili;
	
	public Calisan(String isim, String soyisim, int yas, int calismaYili) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;
		this.calismaYili = calismaYili;
	}
	
	public int maasHesapla() {
		int sonuc = (yas + calismaYili / 20) * 10_000;
		return sonuc;
	}
	
	
	
}
