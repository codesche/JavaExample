
//Q : 정수값을 입력받아 1 부터 입력받은 값까지 1씩 증가된 값을 누적하여
//
//        합을 구하는 코드를 작성한다.
//
//        예 1.)
//        정수 입력 : 3
//        누적합 : 6
//
//        예 2.)
//        정수 입력 : 5
//        누적합 : 15
//
//        예 3.)
//        정수 입력 : 10
//        누적합 : 55

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("누적합 : " + sum);
        
    }

}
