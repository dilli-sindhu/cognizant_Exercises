/*
31. Basic JDBC Connection 
• Objective: Connect Java with a relational database. 
• Task: Connect to a local MySQL/SQLite database and retrieve data. 
• Instructions: 
o Set up a database with a students table. 
o Write code to load the JDBC driver, create a connection, execute a SELECT query, and 
print results.
*/
Database Table
CREATE TABLE students (
    id INTEGER PRIMARY KEY,
    name VARCHAR(50),
    age INTEGER
);

import java.sql.*;

public class JDBCSelect {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            ResultSet rs =
                stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("age")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}