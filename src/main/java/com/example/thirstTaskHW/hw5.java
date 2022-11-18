package com.example.thirstTaskHW;

import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        /*В этой задаче вы должны считать целые числа из стандартного ввода, а затем вывести.
        Каждое целое число нужно печатать с новой строки.Формат ввода: 42 /n 100 /n 125*/
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int w = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        scanner.close();
    }
}
