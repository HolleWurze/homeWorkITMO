package ITMO.lab4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UnicNum {
    public static Integer search(int[] array) {

        System.out.println(Arrays.toString(array));

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        ArrayList<Integer> unicList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> unicEntry : map.entrySet()) {
            if (unicEntry.getValue() == 1) {
                unicList.add(unicEntry.getKey());
            }
        }
        for (Integer firstNum : array) {
            if (unicList.contains(firstNum)) {
                System.out.println(firstNum);
                return firstNum;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        search(array);
    }
}
