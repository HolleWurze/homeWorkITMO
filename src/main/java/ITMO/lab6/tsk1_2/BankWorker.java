package ITMO.lab6.tsk1_2;

public class BankWorker extends Man {
    private String bankName;

    public BankWorker(String name, String surname) {
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
        System.out.println("Не будешь много работать не получишь денег!");
    }
}
