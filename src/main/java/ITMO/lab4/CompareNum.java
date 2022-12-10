package ITMO.lab4;

import java.util.Scanner;

public class CompareNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();

        CompareNumMethod(a, b, c);
        scanner.close();
    }

    private static void CompareNumMethod(int a, int b, int c) {
        if ((a < b) && (b < c)) {
            System.out.println("Результат: " + true);
        } else {
            System.out.println("Результат: " + false);
        }
    }
}
