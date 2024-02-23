import  java.io.*;
import java.net.*;
public class MyServer5 {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(12345);
        Socket clientSocket = ss.accept();
        System.out.println("Client connected");

        InputStream is = clientSocket.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        OutputStream os = clientSocket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        String str1;
        str1 = dis.readUTF();
        System.out.println("From Client: "+str1);
        dos.writeUTF(str1);
        dos.close();
        os.close();
        dis.close();
        is.close();
    }
}
