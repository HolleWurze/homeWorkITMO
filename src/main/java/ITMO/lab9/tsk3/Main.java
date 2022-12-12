package ITMO.lab9.tsk3;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        LinkedList linkedList = new LinkedList<>();

//        addMillionNum(arrayList);
        addMillionNum(linkedList);

//        selectionElements(arrayList);
        selectionElements(linkedList);
    }

    private static void selectionElements(AbstractList list) {

        for (int i = 1; i <= 100000; i++) {
            list.get(ThreadLocalRandom.current().nextInt(0, 1000001));
        }
    }

    private static void addMillionNum(AbstractList list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i, ThreadLocalRandom.current().nextInt(0, 1000001));
        }
    }
}
