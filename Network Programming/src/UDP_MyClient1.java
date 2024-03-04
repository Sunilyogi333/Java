import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_MyClient1 {
    public static void main(String[] args) throws Exception{
        DatagramSocket clientSocket = new DatagramSocket();

        String str = "Hello! Server...";
        byte[] arr = str.getBytes();
        DatagramPacket sendData = new DatagramPacket(arr, arr.length, InetAddress.getByName("localhost"),12345);
        clientSocket.send(sendData);
        clientSocket.close();

    }
}
