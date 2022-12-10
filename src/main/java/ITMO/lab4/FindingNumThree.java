package ITMO.lab4;

import java.util.Arrays;

public class FindingNumThree {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));
        FindingNumThreeMethod(array);
    }

    private static void FindingNumThreeMethod(int[] array) {
        if ((array[0] == 3) || (array[array.length - 1] == 3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
