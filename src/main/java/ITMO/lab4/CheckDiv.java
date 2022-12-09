package ITMO.lab4;

import java.util.Arrays;

public class CheckDiv {
    public static void main(String[] args) {
        int[] array3 = new int[33];
        int[] array5 = new int[20];
        int[] array3_5 = new int[6];
        int a3 = 0;
        int a5 = 0;
        int a3_5 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                array3[a3] = i;
                a3++;
            }
        }
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                array5[a5] = i;
                a5++;
            }
        }
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                array3_5[a3_5] = i;
                a3_5++;
            }
        }
        System.out.println("Делится на 3: " + Arrays.toString(array3));
        System.out.println("Делится на 5: " + Arrays.toString(array5));
        System.out.println("Делится на 3 и 5: " + Arrays.toString(array3_5));
    }
}
