package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
	String userName = "root";
	String password = "1234";
	String connectionUrl = "jdbc:mysql://localhost:3306/test?useUnicode=true&serverTimezone=UTC";
	Class.forName("com.mysql.jdbc.Driver");
	try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password)){
        System.out.println("wooooooo!");
		Statement statement = connection.createStatement();
		statement
    }catch (Exception ex){}
    }
}
