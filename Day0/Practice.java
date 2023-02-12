
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int A = 0;
        int  B = 0;
        int C = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("시간과 분을 입력하세요: ");
        A =sc.nextInt();
        B = sc.nextInt();


        System.out.print("오븐 시간 입력하세요: ");
        C =sc.nextInt();



        if (C<0 || A<0 || A>23 || B<0 || B>59) {
            System.out.println("Invalid input, please try again.");
        } else {
            A = (A + (B + C) / 60) % 24;
            B = (B + C) % 60;
            System.out.printf("Resulting time is: %d hours and %d minutes", A, B);
        }






    }
}