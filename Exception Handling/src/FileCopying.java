import java.io.FileInputStream;
import java.io.FileOutputStream;

//WAP to copy from file
public class FileCopying {
    public static void main (String[] args) throws  Exception {
        FileInputStream fis = new FileInputStream("abc.txt");
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        int data;
        while ((data = fis.read()) != -1) {
            fos.write((char) data);
        }
        System.out.println("copied");
        fos.close();
        fis.close();
    }
}
