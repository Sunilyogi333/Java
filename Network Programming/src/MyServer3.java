//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.ServerSocket;
//import java.net.Socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyServer3 {
    public static void main(String[] args) throws Exception {
        //server socket listening on port 12345
        ServerSocket ss = new ServerSocket(12345);
        System.out.println("Server is listening on port 12345....");

        //wait for a client to connect
        Socket clientSocket = ss.accept();
        System.out.println("Client Connected");

        //input stream to read a data from the client
        InputStream is = clientSocket.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        //output stream to send data to client
        OutputStream os = clientSocket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        String str1, str2;
        while (true) {
            str1 = dis.readUTF();
            System.out.println("From client:" + str1);
//            dos.writeUTF("Hello From Server");
            if (str1.equalsIgnoreCase("bye")) {
                dos.writeUTF("Exit");
                break;
            }
            System.out.print("Server: ");
            str2 = sc.nextLine();
            dos.writeUTF(str2);
            dos.flush();
        }
        System.out.println("Server Disconnected!!!");
        dos.close();
        os.close();
        dis.close();
        is.close();
        ss.close();
    }
}
