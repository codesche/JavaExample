
import java.util.Scanner;

public class HwanJun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int euro = input.nextInt();
        int dollar = input.nextInt();

        // 환율 변수 생성
        double eurRate = 1320.48026;
        double dollarRate = 1063.82979;

        // 환전 하기 및 출력
        int won = (int)(euro * eurRate + dollar * dollarRate);
        System.out.println("58유로 + 32달러 = " + won + "원");

    }
}
