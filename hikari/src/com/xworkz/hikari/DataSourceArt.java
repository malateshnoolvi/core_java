package com.xworkz.hikari;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DataSourceArt {

	public static void main(String[] args) {
 HikariConfig config=new HikariConfig();
 config.setUsername("root");
 config.setPassword("Xworkzodc@123");
 config.setJdbcUrl("jdbc:mysql://localhost:3306/jdbc");
 config.setDriverClassName("com.mysql.cj.jdbc.Driver");
 DataSource source =new HikariDataSource(config);
 try {
	Connection connection = source.getConnection();
	System.out.println("connecction"+connection);
} catch (SQLException e) {
	e.printStackTrace();
}
	}

}
