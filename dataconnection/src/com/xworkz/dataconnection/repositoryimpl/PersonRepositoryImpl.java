package com.xworkz.dataconnection.repositoryimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.xworkz.dataconnection.constant1.MysqlConstant;

import com.xworkz.dataconnection.dto.PersonDTO;
import com.xworkz.dataconnection.repository.PersonRepository;

public class PersonRepositoryImpl implements PersonRepository {

	@Override
	public boolean save(PersonDTO dto) {
		System.out.println("running save method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data loaded and register");
			Connection connection = DriverManager.getConnection(MysqlConstant.URL.getValue(),
					MysqlConstant.NAME.getValue(), MysqlConstant.DONTSEE.getValue());
			String sql = "insert into personinfo1 values(" + dto.getId() + ",'" + dto.getName() + "','" + dto.getEmail()
					+ "'," + dto.getMobileNo() + "," + "'" + dto.getGender() + "','" + dto.getQualification() + "',"
					+ dto.isMarried() + "," + dto.isWorking() + ",'" + dto.getCompanyName() + "'," + ""
					+ dto.getSalary() + "," + dto.getAge() + "," + dto.getExperience() + ",'" + dto.getLocation()
					+ "','" + dto.getCity() + "'," + "'" + dto.getState() + "','" + dto.getCountry() + "',"
					+ dto.getAdharNo() + ",'" + dto.getPanNo() + "'," + "" + dto.isAlive() + ",'" + dto.getBankAcNO()
					+ "')";
			Statement createStatement = connection.createStatement();
			int executeUpdate = createStatement.executeUpdate(sql);
			System.out.println(executeUpdate);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return true;

	}

	@Override
	public void displayAll() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data loaded and register");
			System.out.println("diplay all properties");
			Connection connection = DriverManager.getConnection(MysqlConstant.URL.getValue(),
					MysqlConstant.NAME.getValue(), MysqlConstant.DONTSEE.getValue());
			String sql = "select*from personinfo1";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(sql);
			while (executeQuery.next()) {
				int id = executeQuery.getInt("id");
				String name = executeQuery.getString("name");
				String email = executeQuery.getString("email");
				long mobileNo = executeQuery.getLong("mobileNo");
				String gender = executeQuery.getString("gender");
				String qualification = executeQuery.getString("qualification");
				boolean married = executeQuery.getBoolean("married");
				boolean working = executeQuery.getBoolean("working");
				String companyName = executeQuery.getString("companyName");
				double salary = executeQuery.getDouble("salary");
				int age = executeQuery.getInt("age");
				int experience = executeQuery.getInt("experience");
				String location = executeQuery.getString("location");
				String city = executeQuery.getString("city");
				String state = executeQuery.getString("state");
				String country = executeQuery.getString("country");
				long adharNo = executeQuery.getLong("adharNo");
				String panNo = executeQuery.getString("panNo");
				boolean alive = executeQuery.getBoolean("alive");
				long bankAcNo = executeQuery.getLong("bankAcNo");

				System.out.println(id + " " + name + " " + email + " " + mobileNo + " " + gender + " " + qualification
						+ " " + married + " " + working + " " + companyName + " " + salary + " " + age + " "
						+ experience + " " + location + " " + city + " " + state + " " + " " + country + " " + adharNo
						+ " " + panNo + " " + alive + " " + bankAcNo);

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void displayAllAgeGreaterThenOrderByName(int age) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data loaded and register");
			Connection connection = DriverManager.getConnection(MysqlConstant.URL.getValue(),
					MysqlConstant.NAME.getValue(), MysqlConstant.DONTSEE.getValue());
			String sql = "select*from personinfo1 where age>=25 order by name ";

			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(sql);

			while (executeQuery.next()) {
				String name = executeQuery.getString("name");
				int age1 = executeQuery.getInt("age");

				System.out.println(name + " " + age1);

			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void displayAllByGenderDescOrderByName(String gdr) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data loaded and  register");
			Connection connection = DriverManager.getConnection(MysqlConstant.URL.getValue(),
					MysqlConstant.NAME.getValue(), MysqlConstant.DONTSEE.getValue());
			String sql = "select * from personinfo1 where gender='male' order by name desc";

			Statement createStatement = connection.createStatement();
			ResultSet execute = createStatement.executeQuery(sql);

			while (execute.next()) {

				String gender = execute.getString("gender");
				String name = execute.getString("name");

				System.out.println(name + " " + gender);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void displayAllBySalaryGreaterThanOrderByDesc(double slry) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data loaded and register");
			Connection connection = DriverManager.getConnection(MysqlConstant.URL.getValue(),
					MysqlConstant.NAME.getValue(), MysqlConstant.DONTSEE.getValue());
			String sql = "select * from personinfo1 where salary>=25000 order by salary desc";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(sql);
			while (executeQuery.next()) {
				String name = executeQuery.getString("name");
				double salary = executeQuery.getDouble("salary");

				System.out.println(name + " " + salary);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displatCount() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data loaded and register");
			Connection connection = DriverManager.getConnection(MysqlConstant.URL.getValue(),
					MysqlConstant.NAME.getValue(), MysqlConstant.DONTSEE.getValue());
			String sql = "select count(*)as id from personinfo1";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(sql);
			while (executeQuery.next()) {

				int id = executeQuery.getInt("id");
				System.out.println("total counts id" + id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displaySumOfSalary() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data loaded and register");
			Connection connection = DriverManager.getConnection(MysqlConstant.URL.getValue(),
					MysqlConstant.NAME.getValue(), MysqlConstant.DONTSEE.getValue());
			String sql = "select sum(salary) as salary from personinfo1";
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery(sql);
			while (executeQuery.next()) {
				double salary = executeQuery.getDouble("salary");
				System.out.println("total salary" + salary);

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
