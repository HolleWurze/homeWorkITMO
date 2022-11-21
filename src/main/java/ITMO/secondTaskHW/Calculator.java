package ITMO.secondTaskHW;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char q = scanner.next(".").charAt(0);
        if (q == '+' || q == '-' || q == '/' || q == '*') {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            switch (q) {
                case ('+'):
                    System.out.println(sum(a, b));
                    break;
                case ('-'):
                    System.out.println(sub(a, b));
                    break;
                case ('*'):
                    System.out.println(mult(a, b));
                    break;
                case ('/'):
                    System.out.println(div(a, b));
                    break;
            }
        } else System.err.println("Нет такого оператора!");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static long sum(long a, long b) {
        return a + b;
    }

    static int mult(int a, int b) {
        return a * b;
    }

    static double mult(double a, double b) {
        return a * b;
    }

    static long mult(long a, long b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;

    }

    static double div(double a, double b) {
        return a / b;
    }

    static long div(long a, long b) {
        return a / b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static long sub(long a, long b) {
        return a - b;
    }
}
