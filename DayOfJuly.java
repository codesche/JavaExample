
// 2021년 7월에 한하여 해당 일자의 요일 출력
import java.util.Scanner;

public class DayOfJuly {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("2021년 7월의 날짜를 입력하세요 : ");
        int day = sc.nextInt();
        sc.nextLine();

        if (day >= 1 && day <= 31) {
            switch (day % 7) {
                case 0:
                    System.out.println("수요일 입니다.");
                    break;

                case 1:
                    System.out.println("목요일 입니다.");
                    break;

                case 2:
                    System.out.println("금요일 입니다.");
                    break;

                case 3:
                    System.out.println("토요일 입니다.");
                    break;

                case 4:
                    System.out.println("일요일 입니다.");
                    break;

                case 5:
                    System.out.println("월요일 입니다.");
                    break;

                case 6:
                    System.out.println("화요일 입니다.");
                    break;
            }

            switch(day % 7) {
                // 여러 케이스를 작성
                case 3: case 4:
                    System.out.println("주말입니다.");
                    break;

                default:
                    System.out.println("주중입니다.");
            }
        } else {
            System.out.println("1 ~ 31사이의 값을 입력하세요.");
        }
    }
}
