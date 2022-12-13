package ITMO.lab6.tsk3;

public class Car {
    public float maxWeight;
    public String model;
    public char color;
    public float speed;
    public float weight;

    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public Car(float w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car() {
    }
}

