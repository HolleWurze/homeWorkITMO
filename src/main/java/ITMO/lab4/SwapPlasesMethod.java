package ITMO.lab4;

import java.util.Arrays;

public class SwapPlasesMethod {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));
        Swap(array);
        System.out.println(Arrays.toString(array));
    }

    private static void Swap(int[] array) {
        int q = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = q;
    }

}
