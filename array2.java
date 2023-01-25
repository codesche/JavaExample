

//Q : 길이가 10인 정수 배열을 선언하고 짝수에 해당하는 값을 배열에
//        순차적으로 초기화하는 코드를 작성
public class ex2 {

    public static void main(String[] args) {

        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2 + 2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
