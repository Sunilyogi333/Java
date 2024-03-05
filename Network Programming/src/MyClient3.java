import java.net.*;
import java.io.*;
import java.util.Scanner;

public class MyClient3 {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 12345);

        //output stream to send data to the server
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        //input stream to read data from the server
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        //continuously send data to server
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        while (true){
            System.out.print("Client: ");
            str1 = sc.nextLine();
            dos.writeUTF(str1);
            dos.flush();
            str2 = dis.readUTF();
            System.out.println("From Server: "+str2);
            if(str2.equalsIgnoreCase("Exit")){
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
