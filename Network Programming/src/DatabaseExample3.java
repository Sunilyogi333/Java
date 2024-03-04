import java.sql.*;
import java.util.Scanner;
public class DatabaseExample3 {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/Testing_db";
        String username = "sunil";
        String password = "Sunil@333";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,username,password);

        String str;
        System.out.println("Enter the name of Student");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        String query = "Select * from student where name = ?";
        PreparedStatement psmt = conn.prepareStatement(query);
        psmt.setString(1,str);

        ResultSet rset = psmt.executeQuery();
        int count = 0;

        while (rset.next()){
            count++;
        }
        System.out.println("Total number of student with name "+str+": "+count);
    }
}
