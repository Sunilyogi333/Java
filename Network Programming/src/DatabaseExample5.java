import java.sql.*;
import java.util.Scanner;
public class DatabaseExample5 {
    public static void main(String[] args) throws Exception{
        String Url = "jdbc:mysql://localhost:3306/Testing_db";
        String username = "sunil";
        String password = "Sunil@333";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(Url, username, password);

        String query = "Insert Into student(name,faculty,marks) Values(?,?,?)";
        PreparedStatement psmt = conn.prepareStatement(query);

        String name,faculty;
        int marks;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter name: ");
            name = sc.nextLine();

            System.out.println("Enter faculty: ");
            faculty = sc.nextLine();

            System.out.println("Enter marks: ");
            marks = sc.nextInt();
            sc.nextLine();

            psmt.setString(1,name);
            psmt.setString(2,faculty);
            psmt.setInt(3,marks);

            int row = psmt.executeUpdate();
            System.out.println("Affected rows: "+row);

            System.out.print("Do you wish to continue (y/n): ");
            char ch = sc.next().charAt(0);
            if(ch!='y'){
                break;
            }
            sc.nextLine();
        }
        System.out.println("Program terminated...");
        psmt.close();
        conn.close();

    }
}
