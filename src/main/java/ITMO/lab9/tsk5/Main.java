package ITMO.lab9.tsk5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Вася", 100);
        map.put("Олег", 80);
        map.put("Лиля", 78);
        map.put("Настя", 95);
        map.put("Кирилл", 34);
        map.put("Петя", 60);

        showNumOfPoints(map);
    }

    private static void showNumOfPoints(Map map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя игрока: ");
        String name = scanner.nextLine();
        if (map.containsKey(name) && !name.isEmpty()) {
            System.out.println(map.get(name));
        } else {
            System.err.println("Такого игрока не существует!");
        }
    }
}
