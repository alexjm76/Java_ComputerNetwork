import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;

public class MulticastServer {
    public static void main(String args[]) {
        System.out.println("Multicast Time Server");
                DatagramSocket serverSocket = null; //UDP 프로토콜을 지원
        try {
            serverSocket = new DatagramSocket();
            while (true) {
                String dateText = new Date().toString();
                byte[] buffer = new byte[256];
                buffer = dateText.getBytes();
                InetAddress group = InetAddress.getByName("224.0.0.7");
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, group, 10000);
                serverSocket.send(packet);
                System.out.println("Time sent: " + dateText);

                try {
                    Thread.sleep(1000); //1초 단위 딜레이
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }


    }  catch (IOException ex) {
        // Handle exception
    }
}

}
