import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class DatabaseExample2 {
    public static void main(String[] args) throws Exception{
        String Url = "jdbc:mysql://localhost:3306/Testing_db";
        String username = "sunil";
        String password = "Sunil@333";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(Url,username,password);
        String query = "Select * from student";
        Statement smt = conn.createStatement();
        ResultSet rset = smt.executeQuery(query);

        int count = 0;
        int sum = 0;
        while (rset.next()){
            count++;
            sum += rset.getInt("marks");
            System.out.println(rset.getInt(1)+" "+rset.getString(2));
        }
        int average = sum/count;
        System.out.println("Total Number of Student: "+count);
        System.out.println("Average Marks: "+average);

        conn.close();
    }
}
