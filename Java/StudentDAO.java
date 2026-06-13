/*
32. Insert and Update Operations in JDBC 
• Objective: Perform insert/update SQL queries from Java. 
• Task: Add and modify student data using JDBC. 
• Instructions: 
o Create a StudentDAO class. 
o Implement methods to insert new records and update student details. 
o Use PreparedStatement for parameterized queries. 
*/
import java.sql.*;

public class StudentDAO {

    private Connection con;

    public StudentDAO(Connection con) {
        this.con = con;
    }

    public void insertStudent(int id, String name, int age)
            throws SQLException {

        String sql =
            "INSERT INTO students(id,name,age) VALUES(?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, age);

        ps.executeUpdate();
    }

    public void updateStudent(int id, String newName)
            throws SQLException {

        String sql =
            "UPDATE students SET name=? WHERE id=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, newName);
        ps.setInt(2, id);

        ps.executeUpdate();
    }
}