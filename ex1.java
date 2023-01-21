package Loop;

//Q : 영문자 소문자 a ~ z 까지 출력하시오.
//
//        예 ) a, b, c, d, e, f, g ... x, y, z

public class ex1 {

    public static void main(String[] args) {

        char c = 'a';

        while (c <= 'z') {
            System.out.print(c++ + ", ");
        }

    }

}
