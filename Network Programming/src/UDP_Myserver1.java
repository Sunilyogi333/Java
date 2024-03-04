import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_Myserver1 {
    public static void main(String[] args) throws Exception{
        //create a DatagramSocket
        DatagramSocket  serverSocket = new DatagramSocket(12345);

        //receive a message
        byte[] arr = new byte[1024];
        DatagramPacket receiveData = new DatagramPacket(arr, 1024);
        serverSocket.receive(receiveData);

        //Extract a message from a client
        String str = new String(receiveData.getData(),0,receiveData.getLength());
        System.out.println("The Data from cient: "+str);

        serverSocket.close();
    }
}
