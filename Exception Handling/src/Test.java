import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to write to the file:");
        str = sc.nextLine(); // Use nextLine() to read a whole line
        sc.close(); // Close the Scanner after reading input

        try (FileOutputStream fos = new FileOutputStream("abc.txt")) {
            fos.write(str.getBytes());
            System.out.println("Written successfully");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
