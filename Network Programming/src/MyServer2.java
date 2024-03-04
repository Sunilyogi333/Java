import java.io.*;
import java.net.*;
class ServerThread extends Thread{
    private Socket clientSocket;
    public ServerThread(Socket clientSocket){
        this.clientSocket = clientSocket;
    }
    public void run(){
        try{
            System.out.println("Client Connected"+ clientSocket.getInetAddress());

            //input stream to read data from the client
            InputStream inputStream = clientSocket.getInputStream();
            DataInputStream dis = new DataInputStream(inputStream);

            //output stream to send number to client
            OutputStream outputStream = clientSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(outputStream);
             //read number from the client
            int num = dis.readInt();

            //send square of the number to the client
            dos.writeInt(num*num);
            dos.flush();

            //close the connection for this client
            clientSocket.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

public class MyServer2{
    public static void main(String[] args){
        try{
            //server socket listening on port 12345
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server Listening on port 12345...");
            while(true){
                //wait for a client to connect
                Socket clienSocket = serverSocket.accept();

                //start a new thread to handle the client
                ServerThread st = new ServerThread(clienSocket);
                st.start();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}