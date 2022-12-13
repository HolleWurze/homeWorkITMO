package ITMO.lab6.tsk1_2;

public class Client extends Man{
    private String bankName;
    public Client(String name, String surname) {
        super(name, surname);
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    void GetAllInfoMethod() {
        System.out.println(getName() + " " + getSurname());
        if (getBankName() != null) {
            System.out.println(getName() + " " + getSurname() + " " + getBankName());
        }
    }

    @Override
    public void talk() {
        System.out.println("Хочу много денег!");
    }
}
