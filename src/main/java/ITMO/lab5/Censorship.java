package ITMO.lab5;

import java.util.Scanner;

public class Censorship {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        censorshipMethod(str);
        scanner.close();
    }

    private static void censorshipMethod(String str) {
        String[] parts = str.split(" ");

        String processedString = "";
        for (String part : parts) {
            processedString = processedString + " " + part.replace("бяка", "[Вырезано цензурой]");
        }
        processedString = processedString.strip();
        System.out.println(processedString);
    }
}
