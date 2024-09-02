package org.khnure.lect15.ex1jdbc;

// Import the necessary JDBC classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

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

            // Execute the SQL query (insert statement)
            int rowCount = stmt.executeUpdate("INSERT INTO table_name (name, age) VALUES ('John Doe', 30)");

            // Print the number of rows affected
            System.out.println("Number of rows affected: " + rowCount);

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
