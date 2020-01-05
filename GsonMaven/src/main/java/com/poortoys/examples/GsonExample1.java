package com.poortoys.examples;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GsonExample1 {

	public static void main(String[] args) {

		Gson gson = new Gson();

		Staff staff = new Staff();
		staff.setName("Osman");
		staff.setAge(35);
		staff.setPosition(new String[] { "Founder", "CTO", "Writer", "coder" });
		Map<String, BigDecimal> salary = new HashMap<>();
		
		salary.put("2010", new BigDecimal(10000));
		salary.put("2012", new BigDecimal(12000));
		salary.put("2018", new BigDecimal(14000));
		salary.put("2019", new BigDecimal(50000));

		staff.setSalary(salary);
		staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));
		FileWriter writer = null;
		try {
			writer = new FileWriter("staff.json");
			gson.toJson(staff, writer);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}