package ITMO.lab1;

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        /*Для целого числа b выполните следующие условные действия:
        ●Если b нечетное, выведите “Нечетное”
        ●Если b четное, выведите “Четное”
        ●Если b четное и больше 100, выведите “Выход за пределы диапазона”*/
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else {
            System.out.println("Четное");
            if (b > 100) {
                System.err.println("Выход за пределы диапазона");
            }
        }
        scanner.close();
    }
}
