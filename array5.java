import java.util.Scanner;

//Q : 생성할 배열의 크기를 사용자 입력을 이용하여 생성한 후 다시 사용자 입력을 이용하여
//    사용자가 직접 배열의 크기만큼 초기화할 수 있도록 한다.
//    (생성할 배열 타입은 문자열로 한다.)
public class ex5 {

    public static void main(String[] args) {
        int j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("1차원 배열의 크기 입력 : ");
        int num = sc.nextInt();
        sc.nextLine();
        String sArr[] = new String[num];
        String str = "";

        for (int i = 0; i < sArr.length; i++) {
            System.out.print("배열의 " + (i + 1) + "번째 원소 입력 : ");
            str = sc.nextLine();
            sArr[i] = str;
        }

        while (j < sArr.length) {
            System.out.print(sArr[j] + " ");
            j++;
        }
    }

}
