import java.sql.*;
public class DatabaseExample1{
    public static void main(String[] args)throws Exception{
        String url = "Jdbc:mysql://localhost:3306/serenity";
        String username = "sunil";
        String password = "Sunil@333";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,username,password);
        String query = "Select * from users";
        Statement smt = conn.createStatement();
        ResultSet rset = smt.executeQuery(query);
        while(rset.next()){
            System.out.println(rset.getInt(1)+" "+rset.getString(2));
            rset.next();
        }
        conn.close();
    }
}
