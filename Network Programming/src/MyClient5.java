import java.io.*;
import java.net.*;
import java.util.*;
public class MyClient5 {
    public static void main(String[] args) throws Exception{
        Socket clientSocket = new Socket("localhost",12345);

        InputStream is = clientSocket.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        OutputStream os = clientSocket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        String str1, str2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your message: " );
        str1 = sc.nextLine();
        dos.writeUTF(str1);

        str2 = dis.readUTF();
        System.out.println("From Server: "+str2);

        dos.close();
        os.close();
        dis.close();
        is.close();
    }
}
