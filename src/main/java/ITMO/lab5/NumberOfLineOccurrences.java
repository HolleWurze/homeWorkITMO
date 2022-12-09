package ITMO.lab5;

import java.util.Scanner;

public class NumberOfLineOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку номер 1:");
        String strNumOne = scanner.nextLine();
        System.out.println("Введите строку номер 2:");
        String strNumTwo = scanner.nextLine();

        CountMethod(strNumOne, strNumTwo);
        scanner.close();
    }

    private static void CountMethod(String strNumOne, String strNumTwo) {
        String[] subStrOne = strNumOne.split(" ");
        String[] subStrTwo = strNumTwo.split(" ");
        int count = 0;
        for (int i = 0; i < subStrOne.length; i++) {
            for (int j = 0; j < subStrTwo.length; j++) {
                if (subStrOne[i].equals(subStrTwo[j])) {
                    count++;
                }
            }
        }
        System.out.println("Количество вхождений одной строки в другую = " + count);
    }
}
