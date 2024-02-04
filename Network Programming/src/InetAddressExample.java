import java.net.*;
public class InetAddressExample {
    public static void main(String[] args){
        try{
            InetAddress ina =  InetAddress.getLocalHost();
            System.out.println("HostName:"+ ina.getHostName());
            System.out.println("Host Address:"+ ina.getHostAddress());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
