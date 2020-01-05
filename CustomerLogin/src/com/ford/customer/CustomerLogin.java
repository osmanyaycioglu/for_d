package com.ford.customer;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CustomerLogin {
	public static void main(String[] args) {
		Map<String, Customer> customerMap = new HashMap<String, Customer>();
		Path path = Paths.get("customer.txt");
		try {
			List<String> okunanSatirlar = Files.readAllLines(path, Charset.forName("UTF-8"));
			for (String satir : okunanSatirlar) {
				String[] split = satir.split(",");
				Customer customer = new Customer(split[0], split[1], split[2], split[3], Integer.parseInt(split[4]));
				customerMap.put(customer.getUsername(), customer);
			}
			Scanner scanner = new Scanner(System.in);
			System.out.println("Username : ");
			String user = scanner.next();
			System.out.println("Password : ");
			String pass = scanner.next();
			Customer customer = customerMap.get(user);
			if (customer != null) {
				if (pass.equals(customer.getPassword())) {
					System.out.println("Login baþarýlý");
				} else {
					System.out.println("Login baþarýsýz!!!");
				}
			} else {
				System.out.println("Böyle bir kullanýcý yok");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
