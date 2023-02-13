import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Day1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("www.google.com");
            URLConnection urlConnection = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException ex) {
            System.out.println("test");
            // Handle exceptions
        }

//        try {
//            InetAddress addr = InetAddress.getByName("www.inha.ac.kr");
//            //InetAddress addr = InetAddress.getByName("www.jungmoo.ac.kr"); 이렇게 하면 없는 주소이므로 에러뜸
//            System.out.println(addr);
//            System.out.println(addr.getCanonicalHostName()); //IP
//            System.out.println(addr.getHostAddress()); //IP
//            System.out.println(addr.getHostName()); //url
//        } catch (UnknownHostException e) {
//            throw new RuntimeException(e); //에러 만드는 함수
//        }
    }
}
