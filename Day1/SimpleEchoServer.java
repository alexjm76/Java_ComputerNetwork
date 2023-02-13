import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleEchoServer {
    public static void main(String[] args) {
        System.out.println("에코 서버");
        try (ServerSocket serverSocket = new ServerSocket(6000)){
            System.out.println("Waiting for connection.....");
            Socket clientSocket = serverSocket.accept(); //접속대기
            System.out.println("Connected to client");
            try (
                    BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true))
            {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println("Server: " + line);
                    pw.println(line); //클라이언트로 송신 out객체를 이용한 송신
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);}
        // Handle exceptions
    }


}
