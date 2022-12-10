package ITMO.lab6.tsk3;

public class Truck extends Car {
    int numOfWheels = 0;
    float maxWeight = 0;

    public Truck(float w, String m, char c, float s, int numOfWheels, float maxWeight) {
        super(w, m, c, s);
        this.numOfWheels = numOfWheels;
        this.maxWeight = maxWeight;
    }

    public void NewWheels(int numOfWheels) {
        numOfWheels = 8;
        System.out.println(numOfWheels);
    }
}
