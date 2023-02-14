import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SimpleEchoClient {
    public static void main(String[] args) {
        System.out.println("에코 클라이언트 시작됨");
        try {
            //InetAddress localAddr = InetAddress.getLocalHost();  // 127.0.0.1
            Socket clientSocket = null;
            PrintWriter pw = null;
            BufferedReader br = null;
            try{
                clientSocket = new Socket("127.0.0.1", 20000);
                pw = new PrintWriter(clientSocket.getOutputStream(), true);
                br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                System.out.println("서버에 연결됨");
                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.print("전송 메세지 입력 : ");
                    String line = sc.nextLine();
                    if ("exit".equalsIgnoreCase(line)) {
                        break;  // 종료 조건
                    }
                    pw.println(line);  // 서버로 전송
                    // 서버로 부터 수신받은 객체에서 라인 단위로 문자열 리턴
                    System.out.println("서버로 부터 받은 메세지 : " + br.readLine());
                }
            } catch (IOException ex) {
                System.out.println("입출력 예외 발생");
            } finally {  // 자원 해제
                if (clientSocket != null) clientSocket.close();
                if (pw != null) pw.close();
                if (br != null) br.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}