package ITMO.lab6.tsk1_2;

abstract class Man implements Talkable{
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Man(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    abstract void GetAllInfoMethod();
}

