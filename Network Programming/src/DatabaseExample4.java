import java.sql.*;
public class DatabaseExample4 {
    public static void main(String[] args) throws Exception{
        String Url = "jdbc:mysql://localhost:3306/Testing_db";
        String username = "sunil";
        String password = "Sunil@333";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(Url,username,password);

        String query = "Update student SET marks = 90 where faculty = 'management' ";
        Statement smt = conn.createStatement();
        int rowsAffected = smt.executeUpdate(query);
        System.out.println("Total number of rows affected: "+rowsAffected);
    }
}
