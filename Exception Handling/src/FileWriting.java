//WAP to write in a file
import java.io.*;
import java.util.*;
public class FileWriting {
    public static void main (String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data: ");
        String str = sc.nextLine();
        sc.close();
        FileOutputStream fos = new FileOutputStream("abc.txt",true);
        fos.write(str.getBytes());
        fos.close();
    }
}
