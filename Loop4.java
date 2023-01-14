
//Q : 사용자가 입력한 문자열을 기반으로 파일명이 자동으로 생성되는 프로그램을 만들려고 한다.
//        다음의 요구 사항을 파악하여 사용자가 원하는 기능이 동작하도록 코드를 작성하시오.
//
//        1. 임의의 파일명을 입력할 수 있어야 한다.
//        2. 파일은 1개를 생성할 수도 있지만 원하는 경우 2개 이상도 생성할 수 있다.
//        3. 만약 2개 이상의 파일을 생성하는 경우 2번째 파일 부터는 파일명 뒤에 "[2]" 접미사가 붙는다.
//        4. 3번 요구사항의 접미사 숫자값은 2 로 고정하는 것이 아니라 파일 수에 맞추어 1씩 증가해야 한다.
//
//        예)
//        파일명 입력 : newFile
//        생성 파일수 : 1
//        결과
//        newFile 생성 완료!
//
//        예)
//        파일명 입력 : newFile
//        생성 파일수 : 3
//        결과
//        newFile 생성 완료!
//        newFile[2] 생성 완료!
//        newFile[3] 생성 완료!

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "";
        int num = 0;
        System.out.print("파일명 입력 : ");
        filename = sc.nextLine();

        System.out.print("생성 파일 수 : ");
        num = sc.nextInt();
        sc.nextLine();

        System.out.println("결과");

        if (num <= 0) {
            System.out.println("파일 수는 1개보다 작을 수 없습니다. 양수로 입력!");
            System.exit(0);
        }

        for (int i = 0; i <= num; i++) {

            if (i == 1) {
                System.out.println("\t" + filename + " 생성 완료!");
            } else if (i > 1) {
                System.out.println("\t" + filename + "[" + i + "] 생성 완료! " );
            }

        }

    }

}
