

//Q : 길이가 10인 정수 배열을 선언하고 1 ~ 10까지의 값을 배열에
//        초기화하는 코드를 작성
public class ex1 {

    public static void main(String[] args) {

        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }

}
