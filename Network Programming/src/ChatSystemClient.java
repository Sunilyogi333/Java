import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ChatSystemClient{
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 12345);

        //output stream to send data to the server
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        //input stream to read data from the server
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        //continously send data to server
        Scanner sc = new Scanner(System.in);
        String read, write;
        while (true){
            System.out.print("Client: ");
            write = sc.nextLine();
            dos.writeUTF(write);
            dos.flush();
            read = dis.readUTF();
            System.out.println("From Server: "+read);
            if(read.equalsIgnoreCase("Exit")){
                System.out.println("Exiting....");
                break;
            }
        }
        dos.close();
        os.close();
        dis.close();
        is.close();
        socket.close();
    }
}
