package ITMO.lab4;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число массива:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число массива:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число массива:");
        int c = scanner.nextInt();
        System.out.println("Введите четвертое число массива:");
        int d = scanner.nextInt();
        System.out.println("Введите пятое число массива:");
        int e = scanner.nextInt();
        System.out.println("Введите шестое число массива:");
        int f = scanner.nextInt();

        SortArrayMethod(a, b, c, d, e, f);
        scanner.close();
    }

    private static void SortArrayMethod(int a, int b, int c, int d, int e, int f) {
        int[] array = new int[]{a, b, c, d, e, f};
        boolean itsTrue = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                itsTrue = true;
            } else {
                itsTrue = false;
                break;
            }
        }
        if (itsTrue) {
            System.out.println("OK");
        } else {
            System.err.println("Please try again");
        }
    }
}
