import java.net.*;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.youtube.com/results?search_query=Hindi+song");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Hostname: " + url.getHost());
            System.out.println("Path: " + url.getPath());
            System.out.println("Port Number: " + url.getPort()); // Returns -1 if not specified
            System.out.println("Query: " + url.getQuery());

        } catch ( Exception e) {
            e.printStackTrace();
        }
    }
}
