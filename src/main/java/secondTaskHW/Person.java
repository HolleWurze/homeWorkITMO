package secondTaskHW;

public class Person {
    String name;
    int age;

    public Person() {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alibaba";
        person.age = 34;

        Person person1 = new Person("Ben", 56);
    }

}


