package com.xworkz.supermarket.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.xworkz.supermarket.constant.SuperMarketConstant;
import com.xworkz.supermarket.dto.SuperMarketDTO;

public class SuperMarketRepositoryImpl implements SuperMarketRepository {

	@Override
	public boolean save(SuperMarketDTO dto) {
		System.out.println("running save method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SuperMarketConstant.URL.getValue(),
					SuperMarketConstant.NAME.getValue(), SuperMarketConstant.DONTSEE.getValue());
			String sql = "insert into supermarket values (?,?,?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, dto.getId());
			prepareStatement.setString(2, dto.getName());
			prepareStatement.setString(3, dto.getCompany());
			prepareStatement.setString(4, dto.getGstNo());
			prepareStatement.setInt(5, dto.getPincode());
			prepareStatement.setString(6, dto.getType());
			int executeUpdate = prepareStatement.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println(executeUpdate);
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return true;

		// return true;
	}

	@Override
	public boolean save(List<SuperMarketDTO> list) {
		System.out.println("running save method by list");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SuperMarketConstant.URL.getValue(),
					SuperMarketConstant.NAME.getValue(), SuperMarketConstant.DONTSEE.getValue());
			String sql = "insert into supermarket values(?,?,?,?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			for (SuperMarketDTO superMarketDTO : list) {
				prepareStatement.setInt(1, superMarketDTO.getId());
				prepareStatement.setString(2, superMarketDTO.getName());
				prepareStatement.setString(3, superMarketDTO.getCompany());
				prepareStatement.setString(4, superMarketDTO.getGstNo());
				prepareStatement.setInt(5, superMarketDTO.getPincode());
				prepareStatement.setString(6, superMarketDTO.getType());
				int executeUpdate = prepareStatement.executeUpdate();
				if (executeUpdate > 0) {
					System.out.println(executeUpdate);
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public void displayByName(String name) {
		System.out.println("running display by name method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(SuperMarketConstant.URL.getValue(),
					SuperMarketConstant.NAME.getValue(), SuperMarketConstant.DONTSEE.getValue());
			String sql = "select * from supermarket where name=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, name);
			ResultSet executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				int id = executeQuery.getInt(1);
				String nm = executeQuery.getString(2);
				String company = executeQuery.getString(3);
				String gstNo = executeQuery.getString(4);
				int pincode = executeQuery.getInt(5);
				String type = executeQuery.getString(6);

				System.out.println(id + " " + nm + " " + company + " " + gstNo + " " + pincode + " " + type);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
