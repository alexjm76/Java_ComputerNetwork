
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        Scanner sc = new Scanner(System.in);



        System.out.println("A값을 입력하세요: ");
        A = sc.nextInt();
        System.out.println("B값을 입력하세요: ");
        B = sc.nextInt();
        System.out.printf("%d %d\n",A,B);

        if (A>B){
            System.out.println(">");
        } else if (A<B) {
            System.out.println("<");
        } else if (A==B) {
            System.out.println("==");
            
        }

    }
}