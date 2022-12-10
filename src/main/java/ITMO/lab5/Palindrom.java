package ITMO.lab5;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        palindromMethod(str);
        scanner.close();
    }

    private static void palindromMethod(String str) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str));

        boolean check = false;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == stringBuilder.reverse().charAt(i)) {
                check = true;
            } else {
                System.err.println("Слово не палиндром!");
                break;
            }
        }
        if (check) {
            System.out.println("\u001B[32m" + "Слово палиндром!");
        }
    }
}
