
import java.util.Scanner;       // 스캐너를 사용하기 위해 반드시 import 해야함

public class Alba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 정수값 입력 받음
        int basePay = input.nextInt();

        // 정수값 입력 받아 일한 시간에 대입
        int workingHours = input.nextInt();

        // 급여 = 시급 * 일한시간
        int pay = basePay * workingHours;

        // 출력
        System.out.println(pay);
    }
}
