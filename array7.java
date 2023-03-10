import java.util.Arrays;

// Q : 배열의 깊은복사를 수행하여 배열의 크기를 늘려라.
public class ex2 {

    public static void main(String[] args) {
        // 배열의 깊은 복사 방법
        int[] iArr1 = new int[] {1, 2, 3, 4};
        int[] iArr2 = new int[iArr1.length];

        // 깊은 복사 중...
        for (int i = 0; i < iArr1.length; i++) {
            iArr2[i] = iArr1[i];
        }

        for (int i = 0; i < iArr1.length; i++) {
            System.out.println("iArr1[" + i + "]:" + iArr1[i] + "|iArr2[" + i + "]:" + iArr2[i]);
        }

        iArr1[0] = 15;
        iArr2[3] = 25;
        for (int i = 0; i < iArr1.length; i++) {
            System.out.println("iArr1[" + i + "]:" + iArr1[i] + "|iArr2[" + i + "]:" + iArr2[i]);
        }

        System.out.println("------ 참조값 확인 ------");
        System.out.println("iArr1 참조값 : " + Arrays.toString(iArr1));
        System.out.println("iArr2 참조값 : " + Arrays.toString(iArr2));

    }

}
