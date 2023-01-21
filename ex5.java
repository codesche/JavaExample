
//Q : 출력을 다음과 같이 나오도록 한다.
//
//        1  2   3  4   5  6   7
//        8  9 10 11 12 13 14
//        15 16 17 18 19 20 21
//        22 23 24 25 26 27 28
//        29 30 31 32 33 34 35
//        36 37 38 39 40 41 42

public class ex5 {

    public static void main(String[] args) {

        int num = 1;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%2d ", num);
                num++;
            }
            System.out.println();
        }

    }

}
