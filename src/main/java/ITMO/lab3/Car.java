package ITMO.lab3;

class Car {
    public static void main(String[] args) {
        Car car = new Car("black", "Ford", 1.8);
        Car car1 = new Car("white", "BMW", 1.9);

        System.out.println(car);
        System.out.println(car1);
        car.ColorAndWeight("blue",2.0);
        System.out.println(car);
    }

    String color;
    String name;
    double weight;

    public Car(String color, String name, double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public void Color(String color){
      this.color = color;
    }

    public void ColorAndWeight(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public class Nothing {}

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

