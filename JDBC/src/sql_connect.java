import java.sql.*;

public class sql_connect {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String password = "Root@123";
        String query = "SELECT * FROM students";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded successfully!!!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver error: " + e.getMessage());
        }

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("Connection Established Successfully !!");

            while (rs.next()) {
                int id = rs.getInt("student_id");
                String name = rs.getString("first_name");
                double marks = rs.getDouble("marks");

                System.out.println();
                System.out.println("======================");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Marks: " + marks);
            }

            System.out.println();
            System.out.println("Connection Closed Successfully!!!!");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}