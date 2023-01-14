

//Q : 정수값을 입력받을 때 지정된 범위의 입력값이 아닌 경우
//
//        최대 3번 다시 입력 받을 수 있도록 하는 코드를 작성한다.
//        (지정된 범위는 1 ~ 100 사이의 값이다.)

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("정수 입력 : ");
            int num = sc.nextInt();
            sc.nextLine();

            if (num >= 1 && num <= 100) {
                res = num;
                break;
            } else if (i == 3) {
                System.out.println("3번의 기회를 놓쳤습니다.");
                break;
            } else {
                System.out.println("다시 입력 (1~100 사이의 값)");
            }
        }

        if (res != 0) {
            System.out.println("입력한 정수의 값은 : " + res);
        }

    }

}
