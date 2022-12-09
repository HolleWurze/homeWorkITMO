package ITMO.lab4;

import java.util.Arrays;

public class FindingNumOneOrThree {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));
        int f = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] == 1) || (array[i] == 3)) {
                f++;
            }
        }
        if (f > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
