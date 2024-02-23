import java.io.*;
import java.net.*;
import java.util.*;
public class MyClient4 {
    public static void main(String[] args) throws Exception{
            Socket clientsocket = new Socket("localhost", 12345);

            //input stream
            InputStream is = clientsocket.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            //output stream
            OutputStream os = clientsocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num1 = sc.nextInt();
            dos.writeInt(num1);
            dos.flush();

            int num2 = dis.readInt();
            System.out.println("Square of num from server: "+num2);

            dos.close();
            os.close();
            dis.close();
            is.close();
            clientsocket.close();

    }
}
