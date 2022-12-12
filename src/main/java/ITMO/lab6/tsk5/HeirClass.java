package ITMO.lab6.tsk5;

public class HeirClass extends Major {
    public HeirClass(int age, String name) {
        super(age, name);
    }

    @Override
    public void Print() {
        System.out.println(name);
    }
}
