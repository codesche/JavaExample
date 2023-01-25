

//Q : 길이가 20 인 정수 배열을 선언하고 홀수에 해당하는 값을 배열에 순차적으로
//        초기화하는 코드를 작성
//        단, 99 부터 역순으로 초기화 값을 저장한다.
//
//        int[] iArr = new int[20];
//        int[0] = 99; int[1] = 97;
//        int[2] = 95; int[3] = 93;

public class ex4 {

    public static void main(String[] args) {
        int[] arr = new int[20];
        int j = 0;
        for (int i = 99; i >= arr.length; i -= 2) {
            if (j == 20) {
                break;
            }
            arr[j] = i;
            System.out.print(arr[j] + " ");
            j++;
        }
        System.out.println();
    }

}
