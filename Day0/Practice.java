
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("x 좌표를 입력하세요: ");
        x =sc.nextInt();

        System.out.print("y 좌표를 입력하세요: ");
        y =sc.nextInt();

        System.out.printf("좌표 : (%d %d)\n",x,y);

        if (x>0){
            if(y>0){
                System.out.println("1");
            } else if (y<0) {
                System.out.println("4");

            }
        } else if (x<0) {
            if(y>0){
                System.out.println("2");
            } else if (y<0) {
                System.out.println("3");

            }

        }
        else {
            System.out.println("원점");
        }


    }
}