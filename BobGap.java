

public class BobGap {
    public static void main(String[] args) {
        int donPrice = 8000;                // 돈가스 가격
        int kalPrice = 10000;               // 칼국수 가격
        int kingPrice = 5000;               // 왕만두 가격

        int donNumber = 16;                 // 돈가스 수량
        int kalNumber = 8;                  // 칼국수 수량
        int kingNumber = 1;                 // 왕만두 수량

        // 결과 출력
        System.out.printf("%s x %2d = %6d\n", "돈가스", donNumber, donPrice * donNumber);
        System.out.printf("%s x %2d = %6d\n", "칼국수", kalNumber, kalPrice * kalNumber);
        System.out.printf("%s x %2d = %6d\n", "왕만두", kingNumber, kingPrice * kingNumber);
        System.out.println("=============================");

        int sumPrice = (donPrice * donNumber) +  (kalPrice * kalNumber) + (kingPrice * kingNumber);
        System.out.printf("%s: %d\n", "총합", sumPrice);
    }
}
