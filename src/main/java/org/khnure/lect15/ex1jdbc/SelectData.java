package org.khnure.lect15.ex1jdbc;

// Import the necessary JDBC classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {

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

            // Create a statement object
            Statement stmt = conn.createStatement();

            // Execute the SQL query (select statement)
            ResultSet rs = stmt.executeQuery("SELECT * FROM table_name");

            // Iterate over the result set and print the data
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // Close the statement and connection
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database or executing the query!");
            e.printStackTrace();
        }
    }
}