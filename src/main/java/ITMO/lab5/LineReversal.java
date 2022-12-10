package ITMO.lab5;


import java.util.Scanner;

public class LineReversal {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        LineReversalMethod(str);
        scanner.close();
    }

    private static void LineReversalMethod(String str) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str));
        System.out.println(stringBuilder.reverse());
    }
}
