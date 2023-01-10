import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int kor, eng, math;
        int sum = 0;
        double avg = 0;
        String msg = "불합격";

        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요 : ");
        kor = sc.nextInt();

        System.out.println("영어 점수를 입력하세요 : ");
        eng = sc.nextInt();

        System.out.println("수학 점수를 입력하세요 : ");
        math = sc.nextInt();

        sum = kor + eng + math;
        avg = sum / 3.0;

        System.out.print("총점은 " + sum);
        System.out.printf(", 평균은 %.2f\n", avg);

        if (avg > 60) {
            msg = "합격";
        }

        System.out.println(msg + "입니다");

    }
}
