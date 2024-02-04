import java.io.*;
import java.net.*;
public class Myserver1 {
    public static void main(String[] args) {
      try{
          //Create a server socket
          ServerSocket ss = new ServerSocket(12345);

          //Create a client Socket
          Socket clientSocket = ss.accept();
          System.out.println("client connected...");

          //Create Input Stream
          InputStream is = clientSocket.getInputStream();
          DataInputStream dis = new DataInputStream(is);

          //Read Data & display
          String str = dis.readUTF();
          System.out.println("Data from client:" +str);

          //close connection
          dis.close();
          is.close();
          ss.close();
      }catch (Exception e){
          e.printStackTrace();
      }

    }
}
