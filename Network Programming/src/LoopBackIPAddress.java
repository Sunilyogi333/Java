import java.net.InetAddress;

public class LoopBackIPAddress {
    public static void main(String[] args){
        try{
            InetAddress ina = InetAddress.getLoopbackAddress();
            System.out.println("HostName: "+ ina.getHostName());
            System.out.println(("Host Address:"+ ina.getHostAddress()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
