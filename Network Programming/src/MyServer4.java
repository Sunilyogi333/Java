import java.io.*;
import java.net.*;
public class MyServer4 {
    public static void main(String[] args) throws Exception{
            ServerSocket ss = new ServerSocket(12345);
            Socket sc = ss.accept();
            System.out.println("Client Connected");

            InputStream is = sc.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            OutputStream os = sc.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            int num = dis.readInt();
            dos.writeInt(num*num);
            dos.flush();

            dos.close();
            os.close();
            dis.close();
            is.close();
    }
}
