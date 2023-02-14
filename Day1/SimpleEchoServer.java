import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
// IP 165.246.115.165 포트 20000

public class SimpleEchoServer implements Runnable {
    // 다중 접속 에코 서버
    private static Socket clientSocket;
    public SimpleEchoServer(Socket clientSocket)
    {
        this.clientSocket = clientSocket;
    }
    public static void main(String[] args) {
        System.out.println("다중 접속 에코 서버");
        try (ServerSocket serverSocket = new ServerSocket(20000)) {
            while (true) {
                System.out.println("클라이언트 접속 대기 중.....");
                clientSocket = serverSocket.accept();
                SimpleEchoServer tes = new SimpleEchoServer(clientSocket);
                new Thread(tes).start();
            }
        } catch (IOException ex) {

        }
        System.out.println("다중 접속 에코 서버 종료");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " 스레드 접속");
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                System.out.println(Thread.currentThread() +" 클라이언트가 보낸 메세지 : " + inputLine);
                out.println(inputLine);
            }
            System.out.println(Thread.currentThread() +" 클라이언트가 종료됨"); }
        catch (IOException ex)
        {
        }
    }
}