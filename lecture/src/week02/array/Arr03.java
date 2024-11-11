package week02.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arr03 {
    public static void main(String[] args) {
        // 얕은 복사
        int[] a = {0, 1, 2};
        int[] b = a;

        b[0] = 3;

        System.out.println(a[0]);


        // 1차원 깊은 복사
        int[] c = {0, 1, 2};
        int[] d = a.clone(); // clone() 메소드는 2차원 배열에서는 얕은 복사로 동작

        d[0] = 3;

        System.out.println(c[0]);


        // 2차원 깊은 복사 Arrays.copyOf()
        int[] e = {0, 1, 2};
        int[] f = Arrays.copyOf(e, e.length);

    }
}
