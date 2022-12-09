package ITMO.lab5;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Самое длинное слово в строке: " + LongestWordMethod(str));
        scanner.close();
    }

    private static String LongestWordMethod(String s) {
        String[] parts = s.split(" ");
        String longest = null;
        for (String part : parts) {
            if (longest == null || longest.length() < part.length()) {
                longest = part;
            }
        }
        return longest;
    }
}