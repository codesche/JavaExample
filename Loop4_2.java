import java.util.Scanner;

public class ex4_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열 방식
        System.out.print("파일명 입력 : ");
        String filename = sc.nextLine();

        System.out.print("생성 파일 수 : ");
        int num = sc.nextInt();
        sc.nextLine();

        if (num <= 0) {
            System.out.println("파일 수는 1개보다 작을 수 있습니다. 양수로 입력!");
            System.exit(0);
        }

        System.out.println("결과:");

        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            arr[i] = filename;
            if (i == 0) {
                System.out.println("\t" + filename + " 생성 완료!");
            } else if (i > 0) {
                System.out.println("\t" + filename + "[" + (i + 1) + "] 생성완료! ");
            }
        }

    }

}
