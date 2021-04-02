package com.mindtree.O2Store_Project.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mindtree.O2Store_Project.core.bean.Registration;



public class RegistrationDao {

	public boolean register(Registration registration) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO login_Registration"
				+ "  (id, firstname, lastname, email, password, country) VALUES " + " (?, ?, ?, ?, ?, ?);";
		String query1 = "select count(*) from login_Registration";
		String query2 = "select email from login_Registration";
		int result = 0;
		boolean b = false;
		boolean a = true;
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/o2store", "root",
				"Adarsh123@");

			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			Statement stmt = connection.createStatement();
			Statement stmt2 = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query1);
			ResultSet rs2 = stmt2.executeQuery(query2);
			while(rs2.next()) {
				if(registration.getEmail().equals(rs2.getString(1))) {					
					b=true;
					break;
				}
			}
			if(b==false) {
			rs.next();
			int count = rs.getInt(1);
			preparedStatement.setInt(1, 1 + count);
			preparedStatement.setString(2, registration.getFirstName());
			preparedStatement.setString(3, registration.getLastName());
			preparedStatement.setString(4, registration.getEmail());
			preparedStatement.setString(5, registration.getPassword());
			preparedStatement.setString(6, registration.getCountry());

			result = preparedStatement.executeUpdate();

		} 
			else
				{
				a=false;
				}
		}catch (SQLException e) {
				
			System.out.println("error");
		}
		return a;
	}

}
