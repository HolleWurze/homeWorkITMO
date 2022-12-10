package ITMO.lab3;

public class House {
    public static void main(String[] args) {
        House house = new House(6, 1955, "Сталинка");
        House house1 = new House(10, 1975, "Брежневка");
        System.out.println(house);
        System.out.println(house1);
        house.ChangingValues(15, 2021, "Пыневка");
        house1.ChangingValues(20, 2022, "Собяновка");
        System.out.println(house);
        System.out.println(house1);

    }

    int numberOfFloors;
    int yearOfConstruction;
    String name;

    public House(int numberOfFloors, int yearOfConstruction, String name) {
        this.name = name;
        this.numberOfFloors = numberOfFloors;
        this.yearOfConstruction = yearOfConstruction;
    }

    @Override
    public String toString() {
        return "Здание " +
                "количество этажей = " + numberOfFloors +
                ", год постройки = " + yearOfConstruction +
                ", наименование = '" + name + '\'' +
                '}';
    }

    public void AgeSinceConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;

        int year = 2022;
        year = year - yearOfConstruction;
        System.out.println(year);
    }

    public void ChangingValues(int numberOfFloors, int yearOfConstruction, String name) {
        this.numberOfFloors = numberOfFloors;
        this.yearOfConstruction = yearOfConstruction;
        this.name = name;
    }
}
