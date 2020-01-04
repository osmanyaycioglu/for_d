package com.ford.training.java.example.employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class StringIslemleri {
	public static void main(String[] args) {
		String isim = "Osman Yaycýoðlu";
		String isim3karaktersiz = isim.substring(3);

		String degismisString = isim.replace("man", "zam");
		System.out.println(degismisString);

		int maninYeri = isim.indexOf("man");
		System.out.println(maninYeri);

		boolean contains = isim.contains("aman");
		System.out.println(contains);

		System.out.println(isim3karaktersiz);

		List<String> liste = new ArrayList<>();
		liste.add("osman");
		liste.add("mehmet");
		liste.add("ali");
		for (String abc : liste) {
			System.out.println(abc);
		}

		List<Integer> intListe = new ArrayList<>();
		intListe.add(100);
		intListe.add(200);
		intListe.add(300);
		intListe.add(400);
		for (Integer deger : intListe) {
			System.out.println(deger);
		}

		try {
			File file = new File("test.txt");
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] bytes = new byte[1024];
			int read = fileInputStream.read(bytes);
			if (read > 0) {
				String donenText = new String(bytes, 0, read);
				System.out.println(donenText);
			}
		} catch (Exception exp) {
			System.out.println("Error oluþtu : " + exp.getMessage());
		} finally {
			System.out.println("Son çalýþma noktasý");
		}

		String calisanSatiri = "osman#yaycioglu#50#12";
		String[] a = calisanSatiri.split("#");
		int yas = Integer.parseInt(a[2]);
		int calismaYili = Integer.parseInt(a[3]);
		Calisan calisan = new Calisan(a[0], a[1], yas, calismaYili);
		int maasHesapla = calisan.maasHesapla();
		System.out.println("Maas : " + maasHesapla);

		Path path = Paths.get("test.txt");
		try {
			List<String> okunanSatirlar = Files.readAllLines(path, Charset.forName("UTF-8"));
			StringBuilder butunSatirlar = new StringBuilder();
			for (String satir : okunanSatirlar) {
				butunSatirlar.append(satir);
				butunSatirlar.append("\n");
				System.out.println("Okuduðum : " + satir);
			}

			Path yazacagimFile = Paths.get("okunan.txt");
			Files.write(yazacagimFile, butunSatirlar.toString().getBytes(StandardCharsets.UTF_8), 
					StandardOpenOption.CREATE);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
