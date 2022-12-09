package ITMO.lab4;

import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();

        if (a + b == c) {
            System.out.println("Результат: " + true);
        } else {
            System.out.println("Результат: " + false);
        }
        scanner.close();
    }
}
