package com.xworkz.hotel.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.hotel.constants.HotelConstants;
import com.xworkz.hotel.dto.HotelDTO;

public class HotelRepositoryImpl implements HotelRepository {

	@Override
	public boolean save(HotelDTO dto) {
		System.out.println("running save method");
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(HotelConstants.URL.getValue(),
					HotelConstants.NAME.getValue(), HotelConstants.DONTSEE.getValue());
			String sql = "insert into hotel values(?,?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, dto.getId());
			prepareStatement.setString(2, dto.getName());
			prepareStatement.setString(3, dto.getOwnerName());
			prepareStatement.setInt(4, dto.getWorkers());
			prepareStatement.setString(5, dto.getType());
			int executeUpdate = prepareStatement.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println(executeUpdate);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
