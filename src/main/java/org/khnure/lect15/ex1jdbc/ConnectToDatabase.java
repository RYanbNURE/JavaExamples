package org.khnure.lect15.ex1jdbc;

// Import the necessary JDBC classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDatabase {

    public static void main(String[] args) {
        // Define the JDBC driver and database URL
        String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/database_name";

        // Define the database username and password
        String USER = "root";
        String PASS = "password";

        try {
            // Register the JDBC driver
            Class.forName(JDBC_DRIVER);

            // Establish the connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Print a success message
            System.out.println("Successfully connected to the database!");

            // Close the connection
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database!");
            e.printStackTrace();
        }
    }
}