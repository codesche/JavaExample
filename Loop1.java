
//Q : 정수값을 입력받아 1 부터 입력받은 값까지 1씩 증가된 값을 출력하는 코드를 작성한다.
//
//        단, 1 부터 시작하는 값이 아닌 100 부터 시작하는 형태로 나오게 한다.
//
//
//        예)
//        정수 입력 : 3
//        100 101 102

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문제 1");

        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= num; i++) {
            System.out.print((i + 99) + " ");
        }
        System.out.println();

    }


}
