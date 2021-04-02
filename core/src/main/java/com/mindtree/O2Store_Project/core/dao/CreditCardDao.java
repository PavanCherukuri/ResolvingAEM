package com.mindtree.O2Store_Project.core.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mindtree.O2Store_Project.core.bean.CreditCard;


public class CreditCardDao {

    public int creditDetails(CreditCard creditcard) throws ClassNotFoundException {
        String SQL = "INSERT INTO creditcarddetails" +
            "   VALUES " +
            " (?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/o2store", "root", "Adarsh123@");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setString(1, creditcard.getCardnumber());
            preparedStatement.setString(2, creditcard.getName());
            preparedStatement.setString(3, creditcard.getExpiry());
            preparedStatement.setString(4, creditcard.getCvv());

            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("error");
        }
        return result;
    }
}