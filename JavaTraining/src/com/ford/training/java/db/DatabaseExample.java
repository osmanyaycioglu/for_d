package com.ford.training.java.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DatabaseExample {
	public static void main(String[] args) {
		HikariConfig config = new HikariConfig();
		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		config.setJdbcUrl(
				"jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		config.setUsername("root");
		config.setMaximumPoolSize(5);
		HikariDataSource dataSource = new HikariDataSource(config);
		try {
			Connection connection = dataSource.getConnection();
			String mSql = "SELECT * FROM araba LIMIT 1000";
			PreparedStatement p = connection.prepareStatement(mSql);
			ResultSet r = p.executeQuery();
			while (r.next()) {
				long arabaId = r.getLong("araba_id");
				String arabaIsmi = r.getString("araba_ismi");
				String arabaModel = r.getString("araba_nodel");
				int arabaKM = r.getInt("araba_km");
				System.out.println("ArabaId : " + arabaId + " Araba Ismi : " + arabaIsmi + " Araba Model : "
						+ arabaModel + " Araba KM : " + arabaKM);
			}
			String insertSQL = "INSERT INTO araba (araba_id, araba_ismi, araba_nodel, araba_km) VALUES (?, ?, ?, ?)";
			PreparedStatement insert = connection.prepareStatement(insertSQL);
			insert.setLong(1, 10);
			insert.setString(2, "Test");
			insert.setString(3, "Java Insert");
			insert.setInt(4, 80000);
			
			insert.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
