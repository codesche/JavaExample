

//Q : 길이가 26 인 정수 배열을 선언하고 아스키 문자 영문자(대문자)를 순차적으로
//        초기화하는 코드를 작성

public class ex3 {

    public static void main(String[] args) {
        int arr[] = new int[26];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%c ", i + 65);
        }
    }

}
