import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SimpleEchoClient {
    public static void main(String[] args) {
        System.out.println("에코 클라이언트 시작됨");
        try {
            InetAddress localAddress = InetAddress.getLocalHost(); //127.0.0.1
            Socket clientSocket = null;
            PrintWriter pw = null;
            BufferedReader br =null;

            try{
                clientSocket = new Socket(localAddress, 6000); //로컬인 친구
                //clientSocket = new Socket("여기에 상대방 ip넣기", 6000);
                pw = new PrintWriter(clientSocket.getOutputStream(), true);
                br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                System.out.println("Connected to server");
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    System.out.print("Enter text: ");
                    String line = scanner.nextLine();
                    if ("quit".equalsIgnoreCase(line)) { //IgnoreCase는 모든 문자 대소문자 신경쓰지 않는것
                        break; //종료 조건
                    }
                    pw.println(line); //서버로 전송
                    //서버로부터 수신받은 객체에서 라인단위로 문자열을 return
                    String response = null;
                    System.out.println("Server response: " + response);
                }

            } catch (IOException ex) {
                System.out.println("입출력 예외발생");
            } finally { //자원해제
                clientSocket.close();
                pw.close();
                br.close();
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
