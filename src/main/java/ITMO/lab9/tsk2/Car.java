package ITMO.lab9.tsk2;

public class Car {
    public String model;
    public int age;
    public int mileage;

    public Car(String model, int age, int mileage) {
        this.model = model;
        this.age = age;
        this.mileage = mileage;
    }

    public String makeString() {
        return "Модель: " + model + ", " + "Возраст авто: " + age + ", " + "Пробег: " + mileage;
    }
}
