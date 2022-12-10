package ITMO.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class LengthArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int a = scanner.nextInt();
        System.out.println("Array length = " + a);

        FillingAnArrayOfArbitraryLengthMethod(scanner, a);
        scanner.close();
    }

    private static void FillingAnArrayOfArbitraryLengthMethod(Scanner scanner, int a) {
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Введите число: ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
