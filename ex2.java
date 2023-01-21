package Loop;

//Q : 다음과 같은 형식의 출력이 나오도록 하시오.
//        1 2 3 4 5
//        6 7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20

public class ex2 {

    public static void main(String[] args) {
        int n = 1;
        while (n <= 20) {
            System.out.printf("%-5d", n);

            if (n % 5 == 0) {
                System.out.println();
            }
            n++;
        }
    }
}
