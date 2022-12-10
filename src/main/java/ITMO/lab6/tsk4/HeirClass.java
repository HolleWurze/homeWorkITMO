package ITMO.lab6.tsk4;

public class HeirClass extends Major {

    public HeirClass(int num) {
        super(num);
    }

    void OutPutMethod() {
        System.out.println("Это число главного класса и оно равно: " + super.num);
    }
}
