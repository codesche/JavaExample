
import java.util.Scanner;

// 비만도 계산
public class CheckObesity {

    public static void main(String[] args) {
        double height, weight, bmi;
        String bmistr = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("키를 입력하세요(소수): ");
        height = sc.nextDouble();
        height = height / 100.0;        // cm -> m로 변환

        System.out.print("체중을 입력하세요(소수): ");
        weight = sc.nextDouble();

        bmi = weight / (height * height);

        if (bmi < 18.5) {
            bmistr = "저체중";
        } else if (bmi >= 18.5 && bmi < 23) {
            bmistr = "정상";
        } else if (bmi >= 23 && bmi < 25) {
            bmistr = "과체중";
        } else if (bmi >= 25 && bmi < 30) {
            bmistr = "비만";
        } else {
            bmistr = "고도비만";
        }

        System.out.println("당신의 키는 " + height + "m" + ", 몸무게는 " + weight + "kg"
                        + ", BMI 지수는 "
                        + bmistr + " 입니다.");

    }

}
