import javax.script.ScriptEngine;
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class MyClient2 {
    public static void main(String[] args){
        try {
            //connect to the server on localhost and port 12345
            Socket socket = new Socket("localhost", 12345);

            //number to send to the server
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to send for server");
            int num = sc.nextInt();

            // create output stream to send data to the server
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(outputStream);

            //create input stream to read data from the server
            InputStream inputStream = socket.getInputStream();
            DataInputStream dis = new DataInputStream(inputStream);

            //send number to server
            dos.writeInt(num);
            dos.flush();

            //receive square of number from client
            int numSquare = dis.readInt();
            System.out.println("The number from server is:" + numSquare);

            //close the connection
            socket.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
