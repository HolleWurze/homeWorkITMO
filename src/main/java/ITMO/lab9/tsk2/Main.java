package ITMO.lab9.tsk2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", 10, 200000);
        Car car1 = new Car("Volvo", 15, 180000);
        Car car2 = new Car("Mercedes", 8, 150000);
        Car car3 = new Car("Opel", 5, 20000);
        ArrayList<Car> arrayList = new ArrayList();
        arrayList.add(car);
        arrayList.add(car);
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);

        removeDuplicates(arrayList);

    }

    private static void removeDuplicates(ArrayList<Car> arrayList) {
        Set<Car> set = new HashSet(arrayList);
        for (Car s : set) {
            System.out.println(s.makeString());
        }
    }

}
