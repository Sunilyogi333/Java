import java.net.*;
import java.io.*;

public class Myclient1 {
    public static void main(String[] args){
        try{
            //Create a Socket
            Socket sc = new Socket("localhost", 12345);

            //Create Output Stream
            OutputStream os = sc.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            //Write Data
            String str = "Hello Server";
            dos.writeUTF(str);
            dos.flush();

            //close connection
            dos.close();
            os.close();
            sc.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
