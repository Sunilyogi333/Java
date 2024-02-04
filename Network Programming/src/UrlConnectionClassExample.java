import java.io.InputStream;
import java.net.URLConnection;
import java.net.*;
public class UrlConnectionClassExample {
    public static void main(String[] args){
        try{
            URL url = new URL("https://www.google.com");
            URLConnection UCL = url.openConnection();

            InputStream ips = UCL.getInputStream();
            int data;
            while((data= ips.read())!=-1){
                System.out.println((char)data);
            }
            ips.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
