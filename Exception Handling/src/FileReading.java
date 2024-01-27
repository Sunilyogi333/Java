//WAP to read a file
import java.io.*;
public class FileReading {
    public static void main (String[] args)throws Exception{
        FileInputStream fis = new FileInputStream("abc.txt");
        int data;
        while((data=fis.read())!=-1){
            System.out.print((char)data);
        }
        fis.close();
    }
}
