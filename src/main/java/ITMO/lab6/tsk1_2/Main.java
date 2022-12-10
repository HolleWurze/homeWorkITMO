package ITMO.lab6.tsk1_2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Вася", "Пупкин");
        BankWorker bankWorker = new BankWorker("Александр", "Васильевич");
        bankWorker.setBankName("Alfa");
        client.GetAllInfoMethod();
        bankWorker.GetAllInfoMethod();


        System.out.println(client.getName());
        client.talk();
        System.out.println(bankWorker.getName());
        bankWorker.talk();
    }
}
